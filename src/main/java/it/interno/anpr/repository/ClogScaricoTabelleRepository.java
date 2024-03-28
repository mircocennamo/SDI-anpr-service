package it.interno.anpr.repository;

import it.interno.anpr.entity.ClogScaricoTabelle;
import it.interno.anpr.entity.ClogScaricoTabelleKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClogScaricoTabelleRepository extends JpaRepository<ClogScaricoTabelle, ClogScaricoTabelleKey> {

}
