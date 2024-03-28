package it.interno.anpr.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TCARATTERIDIACRITICI")
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(value = TCaratteriDiacriticiKey.class)
public class TCaratteriDiacritici implements Serializable {

    private static final long serialVersionUID = -8518301868694827363L;

    @Id
    @Column(name = "CODICEUTF8", length = 6)
    String codiceUtf8;

    @Id
    @Column(name = "CARATTEREDIACRITICO", length = 2)
    String carattereDiacritico;

    @Column(name = "DESCRIZIONE", length = 100)
    String descrizione;

    @Id
    @Column(name = "TRASLITTERAZIONEICAO", length = 2)
    String traslitterazioneICAO;

}
