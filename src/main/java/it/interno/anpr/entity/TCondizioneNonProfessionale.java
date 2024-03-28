package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TCONDIZIONENONPROFESSIONALE", schema = "ANPR")
public class TCondizioneNonProfessionale extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = 1856473712836422232L;
}
