package it.interno.anpr.repository;

import it.interno.anpr.entity.TStatiEsteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface TStatiEsteriRepository extends JpaRepository<TStatiEsteri, String>, JpaSpecificationExecutor<TStatiEsteri> {

    @Query(value = "FROM TStatiEsteri t " +
                   "WHERE (:denominazione IS NULL OR t.denominazione LIKE '%' || :denominazione || '%') " +
                   "AND t.datainiziovalidita <= :data " +
                   "AND t.datafinevalidita >= :data ")
    List<TStatiEsteri> getStatiEsteriByDenominazioneAndDate(@Param("denominazione") String denominazione, @Param("data")LocalDate data);
}
