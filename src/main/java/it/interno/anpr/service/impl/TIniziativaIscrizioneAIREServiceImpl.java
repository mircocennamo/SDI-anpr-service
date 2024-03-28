package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TIniziativaIscrizioneAIRE;
import it.interno.anpr.service.TIniziativaIscrizioneAIREService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TIniziativaIscrizioneAIREServiceImpl extends AnprDecoderTable<TIniziativaIscrizioneAIRE> implements TIniziativaIscrizioneAIREService {

    public TIniziativaIscrizioneAIREServiceImpl(JpaRepository<TIniziativaIscrizioneAIRE, Long> repository) {
        super(repository);
    }
}
