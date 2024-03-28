package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TMotivoCostituzioneFamiglia;
import it.interno.anpr.service.TMotivoCostituzioneFamigliaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TMotivoCostituzioneFamigliaServiceImpl extends AnprDecoderTable<TMotivoCostituzioneFamiglia> implements TMotivoCostituzioneFamigliaService{

    public TMotivoCostituzioneFamigliaServiceImpl(JpaRepository<TMotivoCostituzioneFamiglia, Long> repository) {
        super(repository);
    }
}
