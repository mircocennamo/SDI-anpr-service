package it.interno.anpr.repository;

import it.interno.anpr.entity.TCaratteriDiacritici;
import it.interno.anpr.entity.TCaratteriDiacriticiKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TCaratteriDiacriticiRepository extends JpaRepository<TCaratteriDiacritici, TCaratteriDiacriticiKey>, JpaSpecificationExecutor<TCaratteriDiacritici> {

}
