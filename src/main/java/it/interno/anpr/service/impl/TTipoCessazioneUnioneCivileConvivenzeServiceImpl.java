package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TTipoCessazioneUnioneCivileConvivenze;
import it.interno.anpr.service.TTipoCessazioneUnioneCivileConvivenzeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TTipoCessazioneUnioneCivileConvivenzeServiceImpl extends AnprDecoderTable<TTipoCessazioneUnioneCivileConvivenze> implements TTipoCessazioneUnioneCivileConvivenzeService {

    public TTipoCessazioneUnioneCivileConvivenzeServiceImpl(JpaRepository<TTipoCessazioneUnioneCivileConvivenze, Long> repository) {
        super(repository);
    }
}
