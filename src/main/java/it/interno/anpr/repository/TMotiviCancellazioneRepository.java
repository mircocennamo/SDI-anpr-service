package it.interno.anpr.repository;

import it.interno.anpr.entity.TCondizioneNonProfessionale;
import it.interno.anpr.entity.TMotiviCancellazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TMotiviCancellazioneRepository extends JpaRepository<TMotiviCancellazione, Long>, JpaSpecificationExecutor<TMotiviCancellazione> {
}
