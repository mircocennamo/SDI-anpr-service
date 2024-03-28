package it.interno.anpr.repository;

import it.interno.anpr.entity.TLegameConvivenza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TLegameConvivenzaRepository extends JpaRepository<TLegameConvivenza, Long>, JpaSpecificationExecutor<TLegameConvivenza> {
}
