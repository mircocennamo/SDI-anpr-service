package it.interno.anpr.repository;

import it.interno.anpr.entity.TArchivioComuni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface TArchivioComuniRepository extends JpaRepository<TArchivioComuni, Long>, JpaSpecificationExecutor<TArchivioComuni> {


    @Query(value = "FROM TArchivioComuni t " +
                   "WHERE t.denomTraslitterata LIKE '%'|| :descrizione ||'%' " +
                   "AND TO_DATE(t.dataIstituzione, 'YYYY-MM-DD') <= to_date(:data, 'DD-MM-YYYY') " +
                   "AND TO_DATE(t.dataCessazione, 'YYYY-MM-DD') >= to_date(:data, 'DD-MM-YYYY') ")
    List<TArchivioComuni> getComuniByDescrizioneAndData(@Param("descrizione") String descrizione, @Param("data") String data);
}
