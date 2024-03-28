package it.interno.anpr.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(value = ClogScaricoTabelleKey.class)
@Table(name = "CLOG_SCARICO_TABELLE", schema = "ANPR")
public class ClogScaricoTabelle implements Serializable {

    private static final long serialVersionUID = 4894081079770922370L;

    @Id
    @Column(name = "NOMETABELLA", nullable = false, length = 200)
    String nomeTabella;

    @Column(name = "CODICE_ERRORE", length = 50)
    String codiceErrore;

    @Column(name = "DESCRIZIONE_ERRORE", length = 4000)
    String descrizioneErrore;

    @Id
    @Column(name = "TSSCARICO", nullable = false, scale = 6)
    Timestamp tsScarico;

}
