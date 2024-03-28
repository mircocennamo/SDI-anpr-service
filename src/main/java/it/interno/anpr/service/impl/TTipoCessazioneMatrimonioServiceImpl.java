package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TTipoCessazioneMatrimonio;
import it.interno.anpr.service.TTipoCessazioneMatrimonioService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TTipoCessazioneMatrimonioServiceImpl extends AnprDecoderTable<TTipoCessazioneMatrimonio> implements TTipoCessazioneMatrimonioService {

    public TTipoCessazioneMatrimonioServiceImpl(JpaRepository<TTipoCessazioneMatrimonio, Long> repository) {
        super(repository);
    }
}
