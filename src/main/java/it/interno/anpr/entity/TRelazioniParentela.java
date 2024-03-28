package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TRELAZIONIPARENTELA", schema = "ANPR")
public class TRelazioniParentela extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = 6723608312248094330L;

}
