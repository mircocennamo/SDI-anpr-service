package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TSpecieConvivenza;
import it.interno.anpr.service.TSpecieConvivenzaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TSpecieConvivenzaServiceImpl extends AnprDecoderTable<TSpecieConvivenza> implements TSpecieConvivenzaService {

    public TSpecieConvivenzaServiceImpl(JpaRepository<TSpecieConvivenza, Long> repository) {
        super(repository);
    }
}
