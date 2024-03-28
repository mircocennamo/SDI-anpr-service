package it.interno.anpr.mapper;

import it.interno.anpr.dto.TArchivioComuniDto;
import it.interno.anpr.entity.TArchivioComuni;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TArchivioComuniMapper {
    TArchivioComuni toTArchivioComuni(TArchivioComuniDto TArchivioComuniDto);

    @InheritInverseConfiguration
    TArchivioComuniDto toTArchivioComuniDto(TArchivioComuni TArchivioComuni);

}
