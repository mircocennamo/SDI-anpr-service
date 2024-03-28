package it.interno.anpr.repository;

import it.interno.anpr.entity.TMotiviIscrizione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TMotiviIscrizioneRepository extends JpaRepository<TMotiviIscrizione, Long>, JpaSpecificationExecutor<TMotiviIscrizione> {
}
