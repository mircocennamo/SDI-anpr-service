package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TMOTIVISCRIZIONEAIRE", schema = "ANPR")
public class TMotiviIscrizioneAIRE extends BaseEntityStringIdOptionalsFields implements Serializable {

    private static final long serialVersionUID = 1520193295091627225L;
}
