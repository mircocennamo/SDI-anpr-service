package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TTipoIndirizzo;
import it.interno.anpr.exception.TipoIndirizzoNotFound;
import it.interno.anpr.repository.TTipoIndirizzoRepository;
import it.interno.anpr.service.TTipoIndirizzoService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TTipoIndirizzoServiceImpl implements TTipoIndirizzoService {

    private final TTipoIndirizzoRepository tTipoIndirizzoRepository;

    public TTipoIndirizzoServiceImpl(TTipoIndirizzoRepository tTipoIndirizzoRepository) {
        this.tTipoIndirizzoRepository = tTipoIndirizzoRepository;
    }

    @Override
    public String getDescriptionById(Long id) throws TipoIndirizzoNotFound {

        Optional<TTipoIndirizzo> tTipoIndirizzo = tTipoIndirizzoRepository.findById(id);
        return tTipoIndirizzo.orElseThrow(TipoIndirizzoNotFound::new).getDescrizione();
    }

}
