package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TMOTIVICANCELLAZIONE", schema = "ANPR")
public class TMotiviCancellazione extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = 2390507697560974178L;
}
