package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TProfessione;
import it.interno.anpr.service.TProfessioneService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TProfessioneServiceImpl extends AnprDecoderTableStringId<TProfessione> implements TProfessioneService {

    public TProfessioneServiceImpl(JpaRepository<TProfessione, String> repository) {
        super(repository);
    }
}
