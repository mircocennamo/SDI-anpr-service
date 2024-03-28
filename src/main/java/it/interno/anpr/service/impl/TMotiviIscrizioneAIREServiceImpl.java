package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TMotiviIscrizioneAIRE;
import it.interno.anpr.service.TMotiviIscrizioneAIREService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TMotiviIscrizioneAIREServiceImpl extends AnprDecoderTableStringId<TMotiviIscrizioneAIRE> implements TMotiviIscrizioneAIREService {

    public TMotiviIscrizioneAIREServiceImpl(JpaRepository<TMotiviIscrizioneAIRE, String> repository) {
        super(repository);
    }
}
