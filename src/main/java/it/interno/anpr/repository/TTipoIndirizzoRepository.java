package it.interno.anpr.repository;

import it.interno.anpr.entity.TTipoIndirizzo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TTipoIndirizzoRepository extends JpaRepository<TTipoIndirizzo, Long>, JpaSpecificationExecutor<TTipoIndirizzo> {

}
