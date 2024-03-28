package it.interno.anpr.response;

import it.interno.anpr.enumeration.Legame;
import it.interno.anpr.service.*;
import it.interno.anpr.ws._e000vocabolario.TipoDatiSoggettiEnte;
import it.interno.anpr.ws.tipodato.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

@Lazy
@Component
public class ResponseDecoder {

    private final TTipoIndirizzoService tTipoIndirizzoService;
    private final TStatoCivileService tStatoCivileService;
    private final TValidazioneCfService tValidazioneCfService;
    private final TTitoloStudioService tTitoloStudioService;
    private final TTipoCessazioneMatrimonioService tTipoCessazioneMatrimonioService;
    private final TProfessioneService tProfessioneService;
//    private final TTipoCittadinanzaService tTipoCittadinanzaService;
    private final TSpecieConvivenzaService tSpecieConvivenzaService;
    private final TTipoTribunaleService tTipoTribunaleService;
    private final TMotiviIscrizioneAIREService tMotiviIscrizioneAIREService;
    private final TMotiviCancellazioneService tMotiviCancellazioneService;
    private final TCondizioneNonProfessionaleService tCondizioneNonProfessionaleService;
    private final TMotiviIscrizioneService tMotiviIscrizioneService;
    private final TLegameConvivenzaService tLegameConvivenzaService;
    private final TTipoCessazioneUnioneCivileConvivenzeService tTipoCessazioneUnioneCivileConvivenzeService;
    private final TTipoSoggiornoService tTipoSoggiornoService;
    private final TMotivoCostituzioneFamigliaService tMotivoCostituzioneFamigliaService;
    private final TIndividuazioneComuneAIREService tIndividuazioneComuneAIREService;
    private final TRelazioniParentelaService tRelazioniParentelaService;
    private final TIniziativaIscrizioneAIREService tIniziativaIscrizioneAIREService;
    private final TMotiviCancellazioneAIREService tMotiviCancellazioneAIREService;
    private final TMotiviNonCertificabilitaService tMotiviNonCertificabilitaService;

    private final TTipoMovimentazioneService tTipoMovimentazioneService;

    public ResponseDecoder(TTipoIndirizzoService tTipoIndirizzoService, TStatoCivileService tStatoCivileService, TValidazioneCfService tValidazioneCfService, TTitoloStudioService tTitoloStudioService,
                           TTipoCessazioneMatrimonioService tTipoCessazioneMatrimonioService, TProfessioneService tProfessioneService, /*TTipoCittadinanzaService tTipoCittadinanzaService,*/
                           TSpecieConvivenzaService tSpecieConvivenzaService, TTipoTribunaleService tTipoTribunaleService, TMotiviIscrizioneAIREService tMotiviIscrizioneAIREService,
                           TMotiviCancellazioneService tMotiviCancellazioneService, TCondizioneNonProfessionaleService tCondizioneNonProfessionaleService, TMotiviIscrizioneService tMotiviIscrizioneService,
                           TLegameConvivenzaService tLegameConvivenzaService, TTipoCessazioneUnioneCivileConvivenzeService tTipoCessazioneUnioneCivileConvivenzeService, TTipoSoggiornoService tTipoSoggiornoService, TMotivoCostituzioneFamigliaService tMotivoCostituzioneFamigliaService,
                           TIndividuazioneComuneAIREService tIndividuazioneComuneAIREService, TRelazioniParentelaService tRelazioniParentelaService, TIniziativaIscrizioneAIREService tIniziativaIscrizioneAIREService, TMotiviCancellazioneAIREService tMotiviCancellazioneAIREService, TMotiviNonCertificabilitaService tMotiviNonCertificabilitaService, TTipoMovimentazioneService tTipoMovimentazioneService) {
        this.tTipoIndirizzoService = tTipoIndirizzoService;
        this.tStatoCivileService = tStatoCivileService;
        this.tValidazioneCfService = tValidazioneCfService;
        this.tTitoloStudioService = tTitoloStudioService;
        this.tTipoCessazioneMatrimonioService = tTipoCessazioneMatrimonioService;
        this.tProfessioneService = tProfessioneService;
//        this.tTipoCittadinanzaService = tTipoCittadinanzaService;
        this.tSpecieConvivenzaService = tSpecieConvivenzaService;
        this.tTipoTribunaleService = tTipoTribunaleService;
        this.tMotiviIscrizioneAIREService = tMotiviIscrizioneAIREService;
        this.tMotiviCancellazioneService = tMotiviCancellazioneService;
        this.tCondizioneNonProfessionaleService = tCondizioneNonProfessionaleService;
        this.tMotiviIscrizioneService = tMotiviIscrizioneService;
        this.tLegameConvivenzaService = tLegameConvivenzaService;
        this.tTipoCessazioneUnioneCivileConvivenzeService = tTipoCessazioneUnioneCivileConvivenzeService;
        this.tTipoSoggiornoService = tTipoSoggiornoService;
        this.tMotivoCostituzioneFamigliaService = tMotivoCostituzioneFamigliaService;
        this.tIndividuazioneComuneAIREService = tIndividuazioneComuneAIREService;
        this.tRelazioniParentelaService = tRelazioniParentelaService;
        this.tIniziativaIscrizioneAIREService = tIniziativaIscrizioneAIREService;
        this.tMotiviCancellazioneAIREService = tMotiviCancellazioneAIREService;
        this.tMotiviNonCertificabilitaService = tMotiviNonCertificabilitaService;
        this.tTipoMovimentazioneService = tTipoMovimentazioneService;
    }

    public void decodeTipoResidenza(TipoDatiSoggettiEnte soggetto) {
        soggetto.getResidenza().forEach(tipoResidenza -> tipoResidenza.setTipoIndirizzo(tTipoIndirizzoService.getDescriptionById(Long.parseLong(tipoResidenza.getTipoIndirizzo()))));
    }

    public void decodeStatoCivile(TipoStatoCivile statoCivile) {
        Optional.ofNullable(statoCivile)
                .ifPresent(sc -> {
                    setDescriptionIfNotNull(sc.getStatoCivile(), tStatoCivileService::getDescriptionById, sc::setStatoCivile);
                });
    }

    public void decodeValidazioneCF(TipoCodiceFiscale tipoCodiceFiscale) {
        Optional.ofNullable(tipoCodiceFiscale).ifPresent( cf -> tipoCodiceFiscale.setValiditaCF(tValidazioneCfService.getDescriptionById(Long.parseLong(tipoCodiceFiscale.getValiditaCF()))));
    }

    public void decodeAltriDati(TipoDatiSoggettiEnte soggetto) {
        TipoAltriDati altriDati = soggetto.getAltriDati();
        Optional.ofNullable(altriDati)
                .ifPresent(dati -> {
                    setDescriptionIfNotNullString(dati.getTitoloStudio(), tTitoloStudioService::getDescriptionById, dati::setTitoloStudio);
                    setDescriptionIfNotNullString(dati.getPosizioneProfessionale(), tProfessioneService::getDescriptionById, dati::setPosizioneProfessionale);
                });
    }

    public void decodeTipoCessazioneMatrimonio(TipoDatiSoggettiEnte soggetto) {
        TipoAnnullamentoMatrimonio tipoCessazione = soggetto.getAnnullamentoMatrimonio();
        if (Objects.nonNull(tipoCessazione))
            soggetto.getAnnullamentoMatrimonio().setTipoCessazione(tTipoCessazioneMatrimonioService.getDescriptionById(Long.parseLong(tipoCessazione.getTipoCessazione())));
    }

    public void decodeFamigliaConvivenza(TipoDatiSoggettiEnte soggetto) {
        TipoFamigliaConvivenzaRisposta tipoFamigliaConvivenza = soggetto.getFamigliaConvivenza();
        Optional.ofNullable(tipoFamigliaConvivenza).ifPresent( tfcr -> {
            setDescriptionIfNotNull(tfcr.getSpecieConvivenza(), tSpecieConvivenzaService::getDescriptionById, tfcr::setSpecieConvivenza);
            setDescriptionIfNotNull(tfcr.getMotivoCostituzione(), tMotivoCostituzioneFamigliaService::getDescriptionById, tfcr::setMotivoCostituzione);
            setDescriptionIfNotNullString(tfcr.getTipoMovimentazione(), tTipoMovimentazioneService::getDescriptionById, tfcr::setTipoMovimentazione);
            tfcr.setTipoScheda(Legame.getLegameByCodice(tfcr.getTipoScheda()));
        });
    }

    public void decodeAttributiSoggetto(TipoDatiSoggettiEnte soggetto) {
        TipoAttributiSoggetto attributiSoggetto = soggetto.getAttributiSoggetto();
        Optional.ofNullable(attributiSoggetto)
                .ifPresent(tfcr -> setDescriptionIfNotNullString(tfcr.getSoggettoCertificabile(), tMotiviNonCertificabilitaService::getDescriptionById, tfcr::setSoggettoCertificabile));
    }

    public void decodeLegameSoggetto(TipoDatiSoggettiEnte soggetto) {
        TipoLegameSoggettoCompleto legameSoggetto = soggetto.getLegameSoggetto();
        Optional.ofNullable(legameSoggetto).ifPresent(ls -> {
            ls.setTipoLegame(Legame.getLegameByCodice(ls.getTipoLegame()));
            soggetto.getLegameSoggetto().setCodiceLegame(tLegameConvivenzaService.getDescriptionById(Long.parseLong(ls.getCodiceLegame())));
        });

    }

    public void decodeIscrizioneAIRE(TipoDatiSoggettiEnte soggetto) {

        if (Objects.nonNull(soggetto.getDatiIscrizione())) {
            TipoIscrizioneAIRE tipoIscrizioneAIRE = soggetto.getDatiIscrizione().getTipoIscrizioneAIRE();
            Optional.ofNullable(tipoIscrizioneAIRE).ifPresent(tfcr -> {
                tfcr.setMotivoIscrizione(tMotiviIscrizioneAIREService.getDescriptionById(tfcr.getMotivoIscrizione()));
                tfcr.setIniziativaIscrizione(tIniziativaIscrizioneAIREService.getDescriptionById(Long.parseLong(tfcr.getIniziativaIscrizione())));
                tfcr.setIndividuazioneComuneIscrizione(tIndividuazioneComuneAIREService.getDescriptionById(Long.parseLong(tfcr.getIndividuazioneComuneIscrizione())));
            });
        }

    }

    public void decodeIscrizione(TipoDatiSoggettiEnte soggetto) {

        if (Objects.nonNull( soggetto.getDatiIscrizione())) {
            TipoIscrizioneResidente tipoIscrizioneResidente = soggetto.getDatiIscrizione().getIscrizioneResidente();
            Optional.ofNullable(tipoIscrizioneResidente).ifPresent(tir -> {
                tir.setMotivoIscrizione(tMotiviIscrizioneService.getDescriptionById(Long.parseLong(tir.getMotivoIscrizione())));
            });
        }

    }

    public void decodeMatrimonio(TipoDatiSoggettiEnte soggetto) {
        TipoMatrimonio tipoMatrimonio = soggetto.getMatrimonio();
        Optional.ofNullable(tipoMatrimonio).ifPresent(tm -> this.decodeValidazioneCF(tm.getConiuge().getCodiceFiscale()));
    }

    public void decodeUnioneCivile(TipoDatiSoggettiEnte soggetto) {
        TipoUnioneCivile tipoUnioneCivile = soggetto.getUnioneCivile();
        Optional.ofNullable(tipoUnioneCivile).ifPresent(tuc -> this.decodeValidazioneCF(tuc.getUnitoCivilmente().getCodiceFiscale()));
    }

    public void decodeGenitore(TipoDatiSoggettiEnte soggetto) {

        Optional.ofNullable(soggetto.getPaternita()).ifPresent(padre -> {
            this.decodeStatoCivile(padre.getStatoCivile());
            this.decodeValidazioneCF(padre.getGeneralita().getCodiceFiscale());
        });

        Optional.ofNullable(soggetto.getMaternita()).ifPresent(madre -> {
            this.decodeStatoCivile(madre.getStatoCivile());
            this.decodeValidazioneCF(madre.getGeneralita().getCodiceFiscale());
        });

    }


    private <T> void setDescriptionIfNotNull(String value, Function<Long, String> descriptionGetter, Consumer<String> descriptionSetter) {
        if (value != null) {
            String description = descriptionGetter.apply(Long.parseLong(value));
            descriptionSetter.accept(description);
        }
    }

    private <T> void setDescriptionIfNotNullString(String value, Function<String, String> descriptionGetter, Consumer<String> descriptionSetter) {
        if (value != null) {
            String description = descriptionGetter.apply(value);
            descriptionSetter.accept(description);
        }
    }
}
