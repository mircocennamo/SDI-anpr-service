package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TTIPOINDIRIZZO", schema = "ANPR")
public class TTipoIndirizzo  extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = 2733275496255842868L;

}
