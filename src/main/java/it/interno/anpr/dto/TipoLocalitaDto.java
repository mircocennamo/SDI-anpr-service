package it.interno.anpr.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.xml.bind.annotation.XmlElement;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TipoLocalitaDto {


    String descrizioneLocalita;
    String descrizioneStato;
    String codiceStato;
    String provinciaContea;
}
