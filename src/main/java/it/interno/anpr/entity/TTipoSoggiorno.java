package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TTIPOSOGGIORNO", schema = "ANPR")
public class TTipoSoggiorno extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = -4256518692721312651L;
}
