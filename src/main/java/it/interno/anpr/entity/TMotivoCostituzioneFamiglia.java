package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TMOTIVICOSTITUZIONEFAMIGLIA", schema = "ANPR")
public class TMotivoCostituzioneFamiglia extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = -3950106272368546956L;

}
