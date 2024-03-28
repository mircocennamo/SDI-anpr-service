package it.interno.anpr.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TipoComuneDto {

    String nomeComune;
    String codiceIstat;
    String siglaProvinciaIstat;
    String descrizioneLocalita;
}
