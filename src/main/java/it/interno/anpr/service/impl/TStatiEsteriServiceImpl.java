package it.interno.anpr.service.impl;

import it.interno.anpr.dto.TStatiEsteriDto;
import it.interno.anpr.mapper.TStatiEsteriMapper;
import it.interno.anpr.repository.TStatiEsteriRepository;
import it.interno.anpr.service.TStatiEsteriService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TStatiEsteriServiceImpl implements TStatiEsteriService {

    private final TStatiEsteriRepository tStatiEsteriRepository;
    private final TStatiEsteriMapper tStatiEsteriMapper;

    public TStatiEsteriServiceImpl(TStatiEsteriRepository tStatiEsteriRepository, TStatiEsteriMapper tStatiEsteriMapper) {
        this.tStatiEsteriRepository = tStatiEsteriRepository;
        this.tStatiEsteriMapper = tStatiEsteriMapper;
    }

    @Override
    public List<TStatiEsteriDto> getStatiEsteri(String denominazione, String data) {

        return tStatiEsteriRepository.getStatiEsteriByDenominazioneAndDate(denominazione, LocalDate.parse(data))
                .stream()
                .map(tStatiEsteriMapper::toTStatiEsteriDto)
                .collect(Collectors.toList());

    }
}
