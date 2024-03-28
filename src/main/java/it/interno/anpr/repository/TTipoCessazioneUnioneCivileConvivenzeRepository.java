package it.interno.anpr.repository;

import it.interno.anpr.entity.TTipoCessazioneUnioneCivileConvivenze;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TTipoCessazioneUnioneCivileConvivenzeRepository extends JpaRepository<TTipoCessazioneUnioneCivileConvivenze, Long>, JpaSpecificationExecutor<TTipoCessazioneUnioneCivileConvivenze> {
}
