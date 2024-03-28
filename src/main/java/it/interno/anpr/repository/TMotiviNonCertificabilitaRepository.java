package it.interno.anpr.repository;

import it.interno.anpr.entity.TMotiviNonCertificabilita;
import it.interno.anpr.entity.TMotivoCostituzioneFamiglia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TMotiviNonCertificabilitaRepository extends JpaRepository<TMotiviNonCertificabilita, String>, JpaSpecificationExecutor<TMotiviNonCertificabilita> {
}
