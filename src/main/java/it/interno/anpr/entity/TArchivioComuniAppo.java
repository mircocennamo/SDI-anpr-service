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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TARCHIVIOCOMUNI", schema = "ANPR")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TArchivioComuniAppo implements Serializable {

    private static final long serialVersionUID = -8980475356103588740L;

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    Long id;

    @Column(name = "DATAISTITUZIONE", length = 10)
    String dataIstituzione;

    @Column(name = "DATACESSAZIONE", length = 10)
    String dataCessazione;

    @Column(name = "CODISTAT", length = 6)
    String codIstat;

    @Column(name = "CODCATASTALE", length = 4)
    String codCatastale;

    @Column(name = "DENOMINAZIONE_IT", length = 80)
    String denominazioneIt;

    @Column(name = "DENOMTRASLITTERATA", length = 80)
    String denomTraslitterata;

    @Column(name = "ALTRADENOMINAZIONE", length = 80)
    String altraDenominazione;

    @Column(name = "ALTRADENOMINAZIONETRASLITTERATA", length = 80)
    String altraDenominazioneTraslitterata;

    @Column(name = "ID_PROVINCIA")
    Long idProvincia;

    @Column(name = "IDPROVINCIAISTAT")
    Long idProvinciaIstat;

    @Column(name = "ID_REGIONE", nullable = false, length = 2)
    String idRegione;

    @Column(name = "ID_PREFETTURA", length = 3)
    String idPrefettura;

    @Column(name = "STATO",length = 1)
    String stato;

    @Column(name = "SIGLAPROVINCIA", length = 2)
    String siglaProvincia;

    @Column(name = "FONTE", length = 10)
    String fonte;

    @Column(name = "DATAULTIMOAGG", length = 10)
    String dataUltimoAgg;

    @Column(name = "COD_DENOM", length = 6)
    String codDenom;
}
