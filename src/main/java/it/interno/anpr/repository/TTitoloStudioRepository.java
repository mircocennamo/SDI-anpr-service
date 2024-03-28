package it.interno.anpr.repository;

import it.interno.anpr.entity.TTitoloStudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
public interface TTitoloStudioRepository extends JpaRepository<TTitoloStudio, String>, JpaSpecificationExecutor<TTitoloStudio> {
}
