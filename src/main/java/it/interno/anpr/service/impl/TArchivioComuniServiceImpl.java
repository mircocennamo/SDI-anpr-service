package it.interno.anpr.service.impl;

import it.interno.anpr.dto.TArchivioComuniDto;
import it.interno.anpr.mapper.TArchivioComuniMapper;
import it.interno.anpr.repository.TArchivioComuniRepository;
import it.interno.anpr.service.TArchivioComuniService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TArchivioComuniServiceImpl implements TArchivioComuniService {

    private final TArchivioComuniRepository tArchivioComuniRepository;

    private final TArchivioComuniMapper tArchivioComuniMapper;

    public TArchivioComuniServiceImpl(TArchivioComuniRepository tArchivioComuniRepository, TArchivioComuniMapper tArchivioComuniMapper) {
        this.tArchivioComuniRepository = tArchivioComuniRepository;
        this.tArchivioComuniMapper = tArchivioComuniMapper;
    }

    @Override
    public List<TArchivioComuniDto> getComuni(String descrizioneComune, String data) {

        return tArchivioComuniRepository.getComuniByDescrizioneAndData(descrizioneComune.toUpperCase(), data)
                .stream()
                .map(tArchivioComuniMapper::toTArchivioComuniDto)
                .collect(Collectors.toList());
    }
}
