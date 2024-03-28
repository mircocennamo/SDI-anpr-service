package it.interno.anpr.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClogScaricoTabelleKey implements Serializable {

    private static final long serialVersionUID = 642773836272857629L;

    String nomeTabella;
    Timestamp tsScarico;
}
