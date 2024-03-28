package it.interno.anpr.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TELENCOCONSOLATI")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TElencoConsolati implements Serializable {

    private static final long serialVersionUID = -6558542552445571248L;

    @Id
    @Column(name = "CODICECONSOLATO", length = 38)
    Long codiceConsolato;

    @Column(name = "CODICESTATODIAPPARTENENZA", length = 3)
    String codiceStatoDiAppartenenza;

    @Column(name = "DENOMINAZIONESTATODIAPPARTENENZA", length = 100)
    String denominazioneStatoDiAppartenenza;

    @Column(name = "SEDE", length = 100)
    String sede;

    @Column(name = "RANGO", length = 100)
    String rango;

    @Column(name = "INDIRIZZO")
    String indirizzo;

}
