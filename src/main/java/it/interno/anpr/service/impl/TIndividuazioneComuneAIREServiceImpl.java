package it.interno.anpr.service.impl;

import it.interno.anpr.entity.TIndividuazioneComuneAIRE;
import it.interno.anpr.service.TIndividuazioneComuneAIREService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TIndividuazioneComuneAIREServiceImpl extends AnprDecoderTable<TIndividuazioneComuneAIRE> implements TIndividuazioneComuneAIREService {

    public TIndividuazioneComuneAIREServiceImpl(JpaRepository<TIndividuazioneComuneAIRE, Long> repository) {
        super(repository);
    }
}
