package it.interno.anpr.repository;

import it.interno.anpr.entity.TMotiviCancellazioneAIRE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TMotiviCancellazioneAIRERepository extends JpaRepository<TMotiviCancellazioneAIRE, Long>, JpaSpecificationExecutor<TMotiviCancellazioneAIRE> {
}
