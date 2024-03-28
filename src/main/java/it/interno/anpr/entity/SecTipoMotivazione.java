package it.interno.anpr.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(value = SecTipoMotivazioneKey.class)
@Table(name = "SEC_TIPO_MOTIVAZIONE", schema = "ANPR")
public class SecTipoMotivazione implements Serializable {

    private static final long serialVersionUID = -1323721039959952631L;

    @Id
    @Column(name = "ID_TIPO_MOTIVAZIONE", nullable = false, length = 38)
    Integer idTipoMotivazione;

    @Column(name = "DES_MOTIVAZIONE", nullable = false, length = 512)
    String desMotivazione;

    @Id
    @Column(name = "TSINSERIMENTO", nullable = false, scale = 6)
    Timestamp tsInserimento;

    @Column(name = "IDUTENTEINSERIMENTO", nullable = false, columnDefinition = "CHAR", length = 8)
    String idUtenteInserimento;

    @Column(name = "IDUFFICIOINSERIMENTO", nullable = false, columnDefinition = "CHAR", length = 6)
    String idUfficioInserimento;

    @Column(name = "TSCANCELLAZIONE", scale = 6)
    Timestamp tsCancellazione;

    @Column(name = "IDUTENTECANCELLAZIONE", columnDefinition = "CHAR", length = 8)
    String idUtenteCancellazione;

    @Column(name = "IDUFFICIOCANCELLAZIONE", columnDefinition = "CHAR", length = 6)
    String idUfficioCancellazione;

    @Column(name = "FLG_DETT_SINGOLO", nullable = false)
    String flgDettSingolo;

    @Column(name = "RUOLO_ANPR", length = 4)
    String ruoloAnpr;

}
