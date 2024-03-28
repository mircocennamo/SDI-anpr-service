package it.interno.anpr.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonaFisicaDto {

    String nome;
    String cognome;
    String sesso;
    LocalDate dataNascita;

    TipoLuogoNascitaDto tipoLuogoNascitaDto;
}
