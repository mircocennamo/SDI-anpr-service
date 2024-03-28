package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TLEGAMECONVIVENZA", schema = "ANPR")
public class TLegameConvivenza extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = -6594379731848784745L;

}
