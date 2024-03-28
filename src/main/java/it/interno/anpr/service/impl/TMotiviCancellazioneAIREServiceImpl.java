package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TMotiviCancellazioneAIRE;
import it.interno.anpr.service.TMotiviCancellazioneAIREService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TMotiviCancellazioneAIREServiceImpl extends AnprDecoderTable<TMotiviCancellazioneAIRE> implements TMotiviCancellazioneAIREService {

    public TMotiviCancellazioneAIREServiceImpl(JpaRepository<TMotiviCancellazioneAIRE, Long> repository) {
        super(repository);
    }
}
