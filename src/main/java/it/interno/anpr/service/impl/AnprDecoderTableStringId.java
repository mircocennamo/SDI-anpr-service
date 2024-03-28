package it.interno.anpr.service.impl;

import it.interno.anpr.entity.BaseEntity;
import it.interno.anpr.entity.BaseEntityStringId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public abstract class AnprDecoderTableStringId<T extends BaseEntityStringId> {

    protected JpaRepository<T, String> repository;

    public AnprDecoderTableStringId(JpaRepository<T, String> repository) {
        this.repository = repository;
    }

    public String getDescriptionById(String id) {

        Optional<T> entity = repository.findById(id);
        return entity.map(BaseEntityStringId::getDescrizione).orElse(null);
    }
}
