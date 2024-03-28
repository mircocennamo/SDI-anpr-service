package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TTipoSoggiorno;
import it.interno.anpr.service.TTipoSoggiornoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TTipoSoggiornoServiceImpl extends AnprDecoderTable<TTipoSoggiorno> implements TTipoSoggiornoService{

    public TTipoSoggiornoServiceImpl(JpaRepository<TTipoSoggiorno, Long> repository) {
        super(repository);
    }
}
