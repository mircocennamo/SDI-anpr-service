package it.interno.anpr.repository;

import it.interno.anpr.entity.TElencoConsolati;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TElencoConsolatiRepository extends JpaRepository<TElencoConsolati, Long>, JpaSpecificationExecutor<TElencoConsolati> {

}
