package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TTitoloStudio;
import it.interno.anpr.service.TTitoloStudioService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TTitoloStudioServiceImpl extends AnprDecoderTableStringId<TTitoloStudio> implements TTitoloStudioService {

    public TTitoloStudioServiceImpl(JpaRepository<TTitoloStudio, String> repository) {
        super(repository);
    }
}
