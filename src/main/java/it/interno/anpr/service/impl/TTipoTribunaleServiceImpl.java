package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TTipoTribunale;
import it.interno.anpr.service.TTipoTribunaleService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TTipoTribunaleServiceImpl extends AnprDecoderTable<TTipoTribunale> implements TTipoTribunaleService {

    public TTipoTribunaleServiceImpl(JpaRepository<TTipoTribunale, Long> repository) {
        super(repository);
    }
}
