package it.interno.anpr.repository;

import it.interno.anpr.entity.TIndividuazioneComuneAIRE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TIndividuazioneComuneAIRERepository extends JpaRepository<TIndividuazioneComuneAIRE, Long>, JpaSpecificationExecutor<TIndividuazioneComuneAIRE> {
}
