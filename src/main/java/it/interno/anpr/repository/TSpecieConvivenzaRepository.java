package it.interno.anpr.repository;

import it.interno.anpr.entity.TSpecieConvivenza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TSpecieConvivenzaRepository extends JpaRepository<TSpecieConvivenza, Long>, JpaSpecificationExecutor<TSpecieConvivenza> {
}
