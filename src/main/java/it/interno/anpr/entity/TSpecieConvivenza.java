package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TSPECIECONVIVENZA", schema = "ANPR")
public class TSpecieConvivenza extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = -2515669139334995447L;
}
