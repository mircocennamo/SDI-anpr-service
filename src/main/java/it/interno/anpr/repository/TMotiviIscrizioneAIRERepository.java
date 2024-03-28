package it.interno.anpr.repository;

import it.interno.anpr.entity.TMotiviIscrizioneAIRE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TMotiviIscrizioneAIRERepository extends JpaRepository<TMotiviIscrizioneAIRE, String>, JpaSpecificationExecutor<TMotiviIscrizioneAIRE> {
}
