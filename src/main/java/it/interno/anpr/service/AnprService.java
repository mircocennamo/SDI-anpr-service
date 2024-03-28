package it.interno.anpr.service;

import it.interno.anpr.dto.E002ConsultazioneDto;
import it.interno.anpr.ws._e000vocabolario.RispostaE001;
import it.interno.anpr.ws._e000vocabolario.RispostaE002;

import javax.xml.datatype.DatatypeConfigurationException;

public interface AnprService {

    RispostaE001 scaricaTabelle(String idTabella) throws Exception;

    RispostaE002 consultazioneSoggetti(E002ConsultazioneDto e002ConsultazioneDto) throws DatatypeConfigurationException;

}
