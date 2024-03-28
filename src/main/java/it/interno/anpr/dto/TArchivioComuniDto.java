package it.interno.anpr.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Value;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TArchivioComuniDto {

    Long id;
    String dataIstituzione;
    String dataCessazione;
    String codIstat;
    String codCatastale;
    String denominazioneIt;
    String denomTraslitterata;
    String altraDenominazione;
    String altraDenominazioneTraslitterata;
    Long idProvincia;
    Long idProvinciaIstat;
    String idRegione;
    String idPrefettura;
    String stato;
    String siglaProvincia;
    String fonte;
    String dataUltimoAgg;
    String codDenom;
}
