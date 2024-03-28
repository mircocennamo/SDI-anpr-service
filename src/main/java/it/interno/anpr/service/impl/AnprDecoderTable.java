package it.interno.anpr.service.impl;

import it.interno.anpr.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public abstract class AnprDecoderTable<T extends BaseEntity> {

    protected JpaRepository<T, Long> repository;

    public AnprDecoderTable(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    public String getDescriptionById(Long id) {

        Optional<T> entity = repository.findById(id);
        return entity.map(BaseEntity::getDescrizione).orElse(null);
    }
}
