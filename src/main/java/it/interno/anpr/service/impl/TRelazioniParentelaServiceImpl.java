package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TRelazioniParentela;
import it.interno.anpr.service.TRelazioniParentelaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TRelazioniParentelaServiceImpl extends AnprDecoderTable<TRelazioniParentela> implements TRelazioniParentelaService {

    public TRelazioniParentelaServiceImpl(JpaRepository<TRelazioniParentela, Long> repository) {
        super(repository);
    }
}
