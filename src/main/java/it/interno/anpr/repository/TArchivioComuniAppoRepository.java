package it.interno.anpr.repository;

import it.interno.anpr.entity.TArchivioComuniAppo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TArchivioComuniAppoRepository extends JpaRepository<TArchivioComuniAppo, String>{

    @Modifying
    @Query(
            value = "truncate table ANPR.TARCHIVIOCOMUNI_APPO",
            nativeQuery = true
    )
    void truncateTArchivioComuniAppo();

}
