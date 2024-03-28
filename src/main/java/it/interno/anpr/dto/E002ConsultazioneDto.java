package it.interno.anpr.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class E002ConsultazioneDto {

    String idUnicoNazionale;
    String codiceFiscale;
    PersonaFisicaDto personaFisicaDto;

    @NotNull(message = "errore.ruolo.nonpresente")
    String ruolo;

}
