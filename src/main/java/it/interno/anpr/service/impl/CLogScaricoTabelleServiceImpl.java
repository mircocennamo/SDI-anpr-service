package it.interno.anpr.service.impl;

import it.interno.anpr.entity.ClogScaricoTabelle;
import it.interno.anpr.repository.ClogScaricoTabelleRepository;
import it.interno.anpr.service.CLogScaricoTabelleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.Instant;

@Service
public class CLogScaricoTabelleServiceImpl implements CLogScaricoTabelleService {

    private final ClogScaricoTabelleRepository clogScaricoTabelleRepository;

    public CLogScaricoTabelleServiceImpl(ClogScaricoTabelleRepository clogScaricoTabelleRepository) {
        this.clogScaricoTabelleRepository = clogScaricoTabelleRepository;
    }

    @Override
    @Transactional
    public void saveLogScaricoTabelle(String idTabella, String codiceErrore, String descrizioneErrore) {

        ClogScaricoTabelle clogScaricoTabelle = new ClogScaricoTabelle();
        clogScaricoTabelle.setNomeTabella(idTabella);
        clogScaricoTabelle.setCodiceErrore(codiceErrore);
        clogScaricoTabelle.setDescrizioneErrore(descrizioneErrore);
        clogScaricoTabelle.setTsScarico(Timestamp.from(Instant.now()));

        clogScaricoTabelleRepository.save(clogScaricoTabelle);
    }
}
