package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TTipoMovimentazione;
import it.interno.anpr.service.TTipoMovimentazioneService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TTipoMovimentazioneServiceImpl  extends AnprDecoderTableStringId<TTipoMovimentazione> implements TTipoMovimentazioneService {

    public TTipoMovimentazioneServiceImpl(JpaRepository<TTipoMovimentazione, String> repository) {
        super(repository);
    }
}
