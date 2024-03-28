package it.interno.anpr.repository;

import it.interno.anpr.entity.TStatoCivile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TStatoCivileRepository extends JpaRepository<TStatoCivile, Long>, JpaSpecificationExecutor<TStatoCivile> {
}
