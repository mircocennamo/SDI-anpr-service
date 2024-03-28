package it.interno.anpr.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SecTipoMotivazioneKey implements Serializable {

    private static final long serialVersionUID = 4367220080933882888L;

    Integer idTipoMotivazione;
    Timestamp tsInserimento;
}
