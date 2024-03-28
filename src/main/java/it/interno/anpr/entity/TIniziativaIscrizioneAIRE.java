package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TINIZIATIVAISCRIZIONEAIRE", schema = "ANPR")
public class TIniziativaIscrizioneAIRE extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = -9005611056853835145L;
}
