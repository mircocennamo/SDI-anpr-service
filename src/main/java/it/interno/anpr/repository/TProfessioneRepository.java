package it.interno.anpr.repository;

import it.interno.anpr.entity.TProfessione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TProfessioneRepository extends JpaRepository<TProfessione, String>, JpaSpecificationExecutor<TProfessione> {
}
