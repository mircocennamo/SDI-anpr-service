package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TValidazioneCf;
import it.interno.anpr.service.TValidazioneCfService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TValidazioneCfServiceImpl extends AnprDecoderTable<TValidazioneCf> implements TValidazioneCfService {

    public TValidazioneCfServiceImpl(JpaRepository<TValidazioneCf, Long> repository) {
        super(repository);
    }
}
