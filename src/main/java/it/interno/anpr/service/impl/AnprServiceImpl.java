package it.interno.anpr.service.impl;

import it.interno.anpr.config.AnprWsProperties;
import it.interno.anpr.dto.E002ConsultazioneDto;
import it.interno.anpr.dto.PersonaFisicaDto;
import it.interno.anpr.dto.RoleHandler;
import it.interno.anpr.entity.SecTipoMotivazione;
import it.interno.anpr.enumeration.WsSecurity;
import it.interno.anpr.repository.SecTipoMotivazioneRepository;
import it.interno.anpr.response.ResponseE002Component;
import it.interno.anpr.service.AnprService;
import it.interno.anpr.util.Utils;
import it.interno.anpr.ws._e000vocabolario.*;
import it.interno.anpr.ws.e001anprservice.AnprPortTypeE001;
import it.interno.anpr.ws.e001anprservice.AnprServiceE001;
import it.interno.anpr.ws.e002anprservice.AnprPortTypeE002;
import it.interno.anpr.ws.e002anprservice.AnprServiceE002;
import it.interno.anpr.ws.tipodato.TipoComune;
import it.interno.anpr.ws.tipodato.TipoLuogoNascita3000;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.BindingProvider;
import java.io.FileOutputStream;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Slf4j
@Service
public class AnprServiceImpl implements AnprService {

    private final AnprWsProperties anprWsProperties;

    private final ResponseE002Component responseE002Component;

    private final SecTipoMotivazioneRepository secTipoMotivazioneRepository;

    public AnprServiceImpl(AnprWsProperties anprWsProperties, ResponseE002Component responseE002Component, SecTipoMotivazioneRepository secTipoMotivazioneRepository) {
        this.anprWsProperties = anprWsProperties;
        this.responseE002Component = responseE002Component;
        this.secTipoMotivazioneRepository = secTipoMotivazioneRepository;
    }

    @Override
    public RispostaE001 scaricaTabelle(String idTabella) throws Exception {

        RichiestaE001 richiestaE001 = new RichiestaE001();
        TipoTestataRichiestaE000 tipoTestataRichiesta = this.setTipoTestataRichiesta("2020062614250012", "E001");

        TipoDatiRichiestaE001 tipoDatiRichiestaE001 = new TipoDatiRichiestaE001();
        tipoDatiRichiestaE001.setIdTabella(idTabella);
        richiestaE001.setTestataRichiesta(tipoTestataRichiesta);
        richiestaE001.setDatiRichiesta(tipoDatiRichiestaE001);

        AnprServiceE001 port = new AnprServiceE001();

        try {
            AnprPortTypeE001 wsAnprPort = port.getAnprServicePortE001();

            this.setClient(wsAnprPort);

            RispostaE001 rispostaE001 = wsAnprPort.scaricaTabelle(richiestaE001);
            RispostaMultiplaE001 rispostaMultiplaE001 = rispostaE001.getRispostaMultiplaE001();
//            rispostaMultiplaE001.getDatiDettaglioRisposta().getFile().

            FileOutputStream outputStream = new FileOutputStream(rispostaMultiplaE001.getDatiDettaglioRisposta().getFile().getNote().split(":")[1].trim());

            // Scrivere i dati del byte array nel file
            outputStream.write(rispostaMultiplaE001.getDatiDettaglioRisposta().getFile().getContenuto());

            // Chiudere lo stream dopo aver scritto i dati
            outputStream.close();

            return rispostaE001;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public RispostaE002 consultazioneSoggetti(E002ConsultazioneDto e002ConsultazioneDto) throws DatatypeConfigurationException {

        String ruoloAnpr = this.getRuoloAnpr(e002ConsultazioneDto);

        RichiestaE002 richiestaE002 = new RichiestaE002();

        TipoTestataRichiestaE000 tipoTestataRichiesta = this.setTipoTestataRichiesta( "202311141745000004", "E002");

        TipoCriteriRicercaE002 tipoCriteriRicercaE002 = new TipoCriteriRicercaE002();

        if (Objects.nonNull(e002ConsultazioneDto.getCodiceFiscale())) {
            tipoCriteriRicercaE002.setCodiceFiscale(e002ConsultazioneDto.getCodiceFiscale().trim());
        }else if(Objects.nonNull(e002ConsultazioneDto.getIdUnicoNazionale())){
            tipoCriteriRicercaE002.setIdANPR(e002ConsultazioneDto.getIdUnicoNazionale());
        } else {
            PersonaFisicaDto personaFisicaDto = e002ConsultazioneDto.getPersonaFisicaDto();
            tipoCriteriRicercaE002.setNome(personaFisicaDto.getNome());
            tipoCriteriRicercaE002.setCognome(personaFisicaDto.getCognome());
            tipoCriteriRicercaE002.setSesso(personaFisicaDto.getSesso());
            tipoCriteriRicercaE002.setSenzaNome(personaFisicaDto.getNome() == null ? "1" : null);
            TipoDatiNascitaE000 tipoDatiNascitaE000 = this.setTipoDatiNascita(personaFisicaDto);
            tipoCriteriRicercaE002.setDatiNascita(tipoDatiNascitaE000);
        }
        //"STTSGT90A01H501J"

        TipoDatiRichiestaE002 tipoDatiRichiestaE002 = new TipoDatiRichiestaE002();

        //ulteriori dati obbligatori:
        tipoDatiRichiestaE002.setSchedaAnagraficaRichiesta("1");
        tipoDatiRichiestaE002.setDataRiferimentoRichiesta(Utils.setDataOra());
        tipoDatiRichiestaE002.setMotivoRichiesta("SVILUPPO SOFTWARE");

        tipoDatiRichiestaE002.setCasoUso(ruoloAnpr);

        richiestaE002.setTestataRichiesta(tipoTestataRichiesta);
        richiestaE002.setCriteriRicerca(tipoCriteriRicercaE002);
        richiestaE002.setDatiRichiesta(tipoDatiRichiestaE002);

        AnprServiceE002 port = new AnprServiceE002();

        AnprPortTypeE002 wsAnprPort = port.getAnprServicePortE002();

        this.setClient(wsAnprPort);

        RispostaE002 rispostaE002 = wsAnprPort.consultazioneSoggetti(richiestaE002);
        return responseE002Component.handleResponse(rispostaE002);

    }

    private String getRuoloAnpr(E002ConsultazioneDto e002ConsultazioneDto) {

        SecTipoMotivazione motivazione = secTipoMotivazioneRepository.findSecTipoMotivazioneByIdTipoMotivazioneAndTsCancellazioneIsNull(Integer.parseInt(e002ConsultazioneDto.getRuolo()));
        String ruoloAnpr = motivazione.getRuoloAnpr();
        RoleHandler.setRole(ruoloAnpr);

        return ruoloAnpr;
    }

    private TipoDatiNascitaE000 setTipoDatiNascita(PersonaFisicaDto personaFisicaDto) throws DatatypeConfigurationException {

        TipoDatiNascitaE000 tipoDatiNascitaE000 = new TipoDatiNascitaE000();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        tipoDatiNascitaE000.setDataEvento(DatatypeFactory.newInstance().newXMLGregorianCalendar(formatter.format(personaFisicaDto.getDataNascita())));
        TipoLuogoNascita3000 tipoLuogoNascita3000 = this.setTipoLuogoNascita(personaFisicaDto);
        tipoDatiNascitaE000.setLuogoNascita(tipoLuogoNascita3000);

        return tipoDatiNascitaE000;
    }

    private TipoLuogoNascita3000 setTipoLuogoNascita(PersonaFisicaDto personaFisicaDto) {
        TipoLuogoNascita3000 tipoLuogoNascita3000 = new TipoLuogoNascita3000();
        TipoComune tipoComune = new TipoComune();
        tipoComune.setNomeComune(personaFisicaDto.getTipoLuogoNascitaDto().getTipoComuneDto().getNomeComune());
        tipoComune.setCodiceIstat(personaFisicaDto.getTipoLuogoNascitaDto().getTipoComuneDto().getCodiceIstat());
        tipoComune.setSiglaProvinciaIstat(personaFisicaDto.getTipoLuogoNascitaDto().getTipoComuneDto().getSiglaProvinciaIstat());
        tipoLuogoNascita3000.setComune(tipoComune);
        return tipoLuogoNascita3000;
    }

    private TipoTestataRichiestaE000 setTipoTestataRichiesta(String number, String E002) throws DatatypeConfigurationException {

        TipoTestataRichiestaE000 tipoTestataRichiestaE000 = new TipoTestataRichiestaE000();

        tipoTestataRichiestaE000.setIdOperazioneClient(number);
        tipoTestataRichiestaE000.setCodMittente("699999");
        tipoTestataRichiestaE000.setCodDestinatario("ANPR05");
        tipoTestataRichiestaE000.setOperazioneRichiesta(E002);

        tipoTestataRichiestaE000.setDataOraRichiesta(Utils.setDataOra());
        tipoTestataRichiestaE000.setTipoOperazione("C");
        tipoTestataRichiestaE000.setTipoInvio("TEST");
        tipoTestataRichiestaE000.setDataDecorrenza(Utils.setDataOra());
        tipoTestataRichiestaE000.setNomeApplicativo("TESTCLIENT");
        tipoTestataRichiestaE000.setVersioneApplicativo("001");
        tipoTestataRichiestaE000.setFornitoreApplicativo("SOGEI");

        return tipoTestataRichiestaE000;
    }


    protected void setClient(Object wsPort) {
        Client client = ClientProxy.getClient(wsPort);
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor());

        BindingProvider binding = (BindingProvider) wsPort;
        binding.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,  anprWsProperties.getEndpoint().concat("/anpr-wsE000/AnprServiceE002"));
        log.info("ENDPOINT=" + binding.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY));

        //((BindingProvider) wsPort).getRequestContext().put(WsSecurity.CALLBACK_HANDLER.getKey(), "it.interno.anpr.wss.ClientKeystorePasswordCallback");

        //((BindingProvider) wsPort).getRequestContext().put(WsSecurity.SIGNATURE_PROPERTIES.getKey(), "file:////u01/app/oracle/config/domains/anpr/TEST_Keystore.properties");
        ((BindingProvider) wsPort).getRequestContext().put(WsSecurity.SIGNATURE_PROPERTIES.getKey(), "file:///C:/u01/app/oracle/config/domains/anpr/TEST_Keystore.properties");

        ((BindingProvider) wsPort).getRequestContext().put(WsSecurity.SIGNATURE_USERNAME.getKey(), anprWsProperties.getKeystore().getAlias());

        ((BindingProvider) wsPort).getRequestContext().put(WsSecurity.VALIDATION_HANDLER.getKey(), "false");
    }
}
