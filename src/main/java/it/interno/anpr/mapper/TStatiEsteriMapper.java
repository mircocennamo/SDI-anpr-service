package it.interno.anpr.mapper;

import it.interno.anpr.dto.TStatiEsteriDto;
import it.interno.anpr.entity.TStatiEsteri;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TStatiEsteriMapper {
    TStatiEsteri toTStatiEsteri(TStatiEsteriDto TStatiEsteriDto);

    @InheritInverseConfiguration
    TStatiEsteriDto toTStatiEsteriDto(TStatiEsteri TStatiEsteri);
}
