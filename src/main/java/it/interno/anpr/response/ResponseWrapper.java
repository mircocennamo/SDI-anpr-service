package it.interno.anpr.response;

import it.interno.anpr.ws._e000vocabolario.RispostaKO;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class ResponseWrapper<T> {

    public abstract T handleResponse(T risposta);

    public RispostaKO isRispostaKO(RispostaKO rispostaKO) {

        return null;
    }
}
