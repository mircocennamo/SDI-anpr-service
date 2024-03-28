package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TVALIDAZIONECF", schema = "ANPR")
public class TValidazioneCf extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 5537798687293965835L;

}
