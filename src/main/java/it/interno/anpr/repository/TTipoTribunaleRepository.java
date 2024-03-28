package it.interno.anpr.repository;

import it.interno.anpr.entity.TTipoTribunale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TTipoTribunaleRepository extends JpaRepository<TTipoTribunale, Long>, JpaSpecificationExecutor<TTipoTribunale> {
}
