package it.interno.anpr.service;

import it.interno.anpr.dto.TStatiEsteriDto;

import java.util.List;

public interface TStatiEsteriService {

    List<TStatiEsteriDto> getStatiEsteri(String denominazione, String data);
}
