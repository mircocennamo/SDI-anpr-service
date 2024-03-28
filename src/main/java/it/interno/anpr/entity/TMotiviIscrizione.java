package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TMOTIVISCRIZIONE", schema = "ANPR")
public class TMotiviIscrizione extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = -913632719261967484L;
}
