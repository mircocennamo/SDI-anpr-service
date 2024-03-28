package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TMotiviIscrizione;
import it.interno.anpr.service.TMotiviIscrizioneService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TMotiviIscrizioneServiceImpl extends AnprDecoderTable<TMotiviIscrizione> implements TMotiviIscrizioneService {

    public TMotiviIscrizioneServiceImpl(JpaRepository<TMotiviIscrizione, Long> repository) {
        super(repository);
    }
}
