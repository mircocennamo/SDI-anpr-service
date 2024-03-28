package it.interno.anpr.repository;

import it.interno.anpr.entity.TTipoMovimentazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TTipoMovimentazioneRepository extends JpaRepository<TTipoMovimentazione, String>, JpaSpecificationExecutor<TTipoMovimentazione> {

}
