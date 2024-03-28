package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TTIPOTRIBUNALE", schema = "ANPR")
public class TTipoTribunale extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 9105793867692854821L;

}
