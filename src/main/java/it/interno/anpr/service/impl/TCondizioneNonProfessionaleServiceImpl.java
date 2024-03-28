package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TCondizioneNonProfessionale;
import it.interno.anpr.service.TCondizioneNonProfessionaleService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TCondizioneNonProfessionaleServiceImpl extends AnprDecoderTable<TCondizioneNonProfessionale> implements TCondizioneNonProfessionaleService {

    public TCondizioneNonProfessionaleServiceImpl(JpaRepository<TCondizioneNonProfessionale, Long> repository) {
        super(repository);
    }
}
