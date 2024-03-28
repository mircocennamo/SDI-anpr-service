package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TMotiviNonCertificabilita;
import it.interno.anpr.service.TMotiviNonCertificabilitaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TMotiviNonCertificabilitaServiceImpl extends AnprDecoderTableStringId<TMotiviNonCertificabilita> implements TMotiviNonCertificabilitaService {

    public TMotiviNonCertificabilitaServiceImpl(JpaRepository<TMotiviNonCertificabilita, String> repository) {
        super(repository);
    }
}
