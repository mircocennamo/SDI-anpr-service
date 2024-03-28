package it.interno.anpr.repository;

import it.interno.anpr.entity.TIniziativaIscrizioneAIRE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TIniziativaIscrizioneAIRERepository extends JpaRepository<TIniziativaIscrizioneAIRE, Long>, JpaSpecificationExecutor<TIniziativaIscrizioneAIRE> {
}
