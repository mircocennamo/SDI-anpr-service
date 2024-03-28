package it.interno.anpr.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TSTATIESTERI")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TStatiEsteri implements Serializable {

    private static final long serialVersionUID = -2970510010701979123L;

    @Id
    @Column(name = "ID", length = 4)
    String id;

    @Column(name = "DENOMINAZIONE", length = 80)
    String denominazione;

    @Column(name = "DENOMINAZIONEISTAT", length = 80)
    String denominazioneIstat;

    @Column(name = "DENOMINAZIONEISTAT_EN", length = 80)
    String denominazioneIstatEn;

    @Column(name = "DATAINIZIOVALIDITA")
    LocalDate datainiziovalidita;

    @Column(name = "DATAFINEVALIDITA")
    LocalDate datafinevalidita;

    @Column(name = "CODISO3166_1_ALPHA3", length = 3)
    String codiso31661Alpha3;

    @Column(name = "CODMAE", length = 3)
    String codMae;

    @Column(name = "CODMIN", length = 80)
    String codMin;

    @Column(name = "CODAT", length = 4)
    String coDat;

    @Column(name = "CODISTAT", length = 3)
    String codIstat;

    @Column(name = "CITTADINANZA", columnDefinition = "CHAR")
    String cittadinanza;

    @Column(name = "NASCITA", columnDefinition = "CHAR")
    String nascita;

    @Column(name = "RESIDENZA", columnDefinition = "CHAR")
    String residenza;

    @Column(name = "FONTE", length = 80)
    String fonte;

    @Column(name = "TIPO", length = 20)
    String tipo;

    @Column(name = "CODISOSOVRANOFONTE", length = 3)
    String codIsoSovranoFonte;

    @Column(name = "DESCRIZIONECITTADINANZA", length = 100)
    String descrizioneCittadinanza;

    @Column(name = "DATAULTIMOAGG")
    LocalDate dataUltimoAgg;

}
