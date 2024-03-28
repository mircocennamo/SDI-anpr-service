package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TMOTIVICANCELLAZIONEAIRE", schema = "ANPR")
public class TMotiviCancellazioneAIRE extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = 1844763278243558581L;
}
