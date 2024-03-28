package it.interno.anpr.repository;

import it.interno.anpr.entity.TCondizioneNonProfessionale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TCondizioneNonProfessionaleRepository extends JpaRepository<TCondizioneNonProfessionale, Long>, JpaSpecificationExecutor<TCondizioneNonProfessionale> {
}
