package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TLegameConvivenza;
import it.interno.anpr.service.TLegameConvivenzaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TLegameConvivenzaServiceImpl extends AnprDecoderTable<TLegameConvivenza> implements TLegameConvivenzaService {

    public TLegameConvivenzaServiceImpl(JpaRepository<TLegameConvivenza, Long> repository) {
        super(repository);
    }
}
