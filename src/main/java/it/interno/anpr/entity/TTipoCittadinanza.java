package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TTIPOCITTADINANZA", schema = "ANPR")
public class TTipoCittadinanza extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = -2050515142887345195L;
}
