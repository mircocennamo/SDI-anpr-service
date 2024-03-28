package it.interno.anpr.repository;

import it.interno.anpr.entity.TTipoCessazioneMatrimonio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TTipoCessazioneMatrimonioRepository extends JpaRepository<TTipoCessazioneMatrimonio, Long>, JpaSpecificationExecutor<TTipoCessazioneMatrimonio> {
}
