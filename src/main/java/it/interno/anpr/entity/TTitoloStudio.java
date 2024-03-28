package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TTITOLOSTUDIO", schema = "ANPR")
public class TTitoloStudio extends BaseEntityStringIdOptionalsFields implements Serializable {

    private static final long serialVersionUID = 6948768181733920239L;
}
