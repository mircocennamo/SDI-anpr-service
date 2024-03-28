package it.interno.anpr.repository;

import it.interno.anpr.entity.TTipoSoggiorno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TTipoSoggiornoRepository extends JpaRepository<TTipoSoggiorno, Long>, JpaSpecificationExecutor<TTipoSoggiorno> {
}
