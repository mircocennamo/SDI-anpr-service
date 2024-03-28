package it.interno.anpr.response;

import it.interno.anpr.ws._e000vocabolario.RispostaE002;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Lazy
@Component
public class ResponseE002Component extends ResponseWrapper<RispostaE002>{

    private final ResponseDecoder responseDecoder;

    public ResponseE002Component(ResponseDecoder responseDecoder) {
        this.responseDecoder = responseDecoder;
    }

    @Override
    public RispostaE002 handleResponse(RispostaE002 rispostaE002) {

        if (Objects.nonNull(rispostaE002.getRispostaE002OK())) {
            rispostaE002.getRispostaE002OK().getListaSoggetti().getDatiSoggetto().forEach(soggetto -> {
                responseDecoder.decodeStatoCivile(soggetto.getStatoCivile());
                responseDecoder.decodeTipoResidenza(soggetto);
                responseDecoder.decodeValidazioneCF(soggetto.getGeneralita().getCodiceFiscale());
                responseDecoder.decodeAltriDati(soggetto);
                responseDecoder.decodeTipoCessazioneMatrimonio(soggetto);
                responseDecoder.decodeFamigliaConvivenza(soggetto);
                responseDecoder.decodeAttributiSoggetto(soggetto);
                responseDecoder.decodeLegameSoggetto(soggetto);
                responseDecoder.decodeIscrizioneAIRE(soggetto);
                responseDecoder.decodeIscrizione(soggetto);
                responseDecoder.decodeMatrimonio(soggetto);
                responseDecoder.decodeUnioneCivile(soggetto);
                responseDecoder.decodeGenitore(soggetto);
            });
        }

        return rispostaE002;
    }

}
