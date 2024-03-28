package it.interno.anpr.service;

import it.interno.anpr.dto.TArchivioComuniDto;

import java.time.LocalDate;
import java.util.List;

public interface TArchivioComuniService {

    List<TArchivioComuniDto> getComuni(String descrizioneComune, String data);
}
