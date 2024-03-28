package it.interno.anpr.service;

import it.interno.anpr.exception.TipoIndirizzoNotFound;

public interface TTipoIndirizzoService {

    String getDescriptionById(Long id) throws TipoIndirizzoNotFound;
}
