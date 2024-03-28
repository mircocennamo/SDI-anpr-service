package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TINDIVIDUAZIONECOMUNEAIRE", schema = "ANPR")
public class TIndividuazioneComuneAIRE extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = -2548844910317280569L;
}
