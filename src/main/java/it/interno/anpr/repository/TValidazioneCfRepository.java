package it.interno.anpr.repository;

import it.interno.anpr.entity.TValidazioneCf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TValidazioneCfRepository extends JpaRepository<TValidazioneCf, Long>, JpaSpecificationExecutor<TValidazioneCf> {
}
