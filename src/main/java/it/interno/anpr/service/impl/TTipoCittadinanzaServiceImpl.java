package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TTipoCittadinanza;
import it.interno.anpr.service.TTipoCittadinanzaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TTipoCittadinanzaServiceImpl extends AnprDecoderTable<TTipoCittadinanza> implements TTipoCittadinanzaService {

    public TTipoCittadinanzaServiceImpl(JpaRepository<TTipoCittadinanza, Long> repository) {
        super(repository);
    }
}
