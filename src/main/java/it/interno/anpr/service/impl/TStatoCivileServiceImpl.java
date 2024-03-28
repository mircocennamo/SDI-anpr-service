package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TStatoCivile;
import it.interno.anpr.entity.TTipoIndirizzo;
import it.interno.anpr.exception.StatoCivileNotFound;
import it.interno.anpr.exception.TipoIndirizzoNotFound;
import it.interno.anpr.repository.TStatoCivileRepository;
import it.interno.anpr.service.TStatoCivileService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TStatoCivileServiceImpl extends AnprDecoderTable<TStatoCivile> implements TStatoCivileService{

    public TStatoCivileServiceImpl(TStatoCivileRepository tStatoCivileRepository) {
        super(tStatoCivileRepository);
    }
}
