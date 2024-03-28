package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TMotiviCancellazione;
import it.interno.anpr.service.TMotiviCancellazioneService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TMotiviCancellazioneServiceImpl extends AnprDecoderTable<TMotiviCancellazione> implements TMotiviCancellazioneService {

    public TMotiviCancellazioneServiceImpl(JpaRepository<TMotiviCancellazione, Long> repository) {
        super(repository);
    }
}
