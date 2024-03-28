package it.interno.anpr.repository;

import it.interno.anpr.entity.TRelazioniParentela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TRelazioniParentelaRepository extends JpaRepository<TRelazioniParentela, Long>, JpaSpecificationExecutor<TRelazioniParentela> {
}
