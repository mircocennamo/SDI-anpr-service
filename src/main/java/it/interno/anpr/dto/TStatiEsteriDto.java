package it.interno.anpr.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Value;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TStatiEsteriDto {

    String id;
    String deominazione;
    String denominazioneIstat;
    String denominazioneIstatEn;
    LocalDate datainiziovalidita;
    LocalDate datafinevalidita;
    String codiso31661Alpha3;
    String codMae;
    String codMin;
    String coDat;
    String codIstat;
    String cittadinanza;
    String nascita;
    String residenza;
    String fonte;
    String tipo;
    String codIsoSovranoFonte;
    String descrizioneCittadinanza;
    LocalDate dataUltimoAgg;
}
