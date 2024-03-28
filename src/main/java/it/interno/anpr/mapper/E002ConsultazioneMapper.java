package it.interno.anpr.mapper;


import it.interno.anpr.dto.E002ConsultazioneDto;
import it.interno.anpr.ws._e000vocabolario.RichiestaE002;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, componentModel = "spring")
public interface E002ConsultazioneMapper {


    @Mapping(source = "personaFisicaDto.nome", target = "criteriRicerca.nome")
    @Mapping(source = "personaFisicaDto.cognome", target = "criteriRicerca.cognome")
    RichiestaE002 toRichiestaE002(E002ConsultazioneDto e002ConsultazioneDto);
}
