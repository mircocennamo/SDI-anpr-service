package it.interno.anpr.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TCaratteriDiacriticiKey implements Serializable {

    private static final long serialVersionUID = -8623399941424777092L;

    String codiceUtf8;
    String carattereDiacritico;
    String descrizione;
    String traslitterazioneICAO;
}
