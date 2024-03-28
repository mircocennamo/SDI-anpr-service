package it.interno.anpr.repository;

import it.interno.anpr.entity.SecTipoMotivazione;
import it.interno.anpr.entity.SecTipoMotivazioneKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SecTipoMotivazioneRepository extends JpaRepository<SecTipoMotivazione, SecTipoMotivazioneKey>, JpaSpecificationExecutor<SecTipoMotivazione> {

    SecTipoMotivazione findSecTipoMotivazioneByIdTipoMotivazioneAndTsCancellazioneIsNull(Integer tipoMotivazione);
}
