package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TTIPOMOVIMENTAZIONE", schema = "ANPR")
public class TTipoMovimentazione extends BaseEntityStringIdOptionalsFields implements Serializable {

    private static final long serialVersionUID = -2006624652533894068L;
}
