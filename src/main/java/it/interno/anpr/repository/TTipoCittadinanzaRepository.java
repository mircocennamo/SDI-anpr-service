package it.interno.anpr.repository;

import it.interno.anpr.entity.TTipoCittadinanza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TTipoCittadinanzaRepository extends JpaRepository<TTipoCittadinanza, Long>, JpaSpecificationExecutor<TTipoCittadinanza> {
}
