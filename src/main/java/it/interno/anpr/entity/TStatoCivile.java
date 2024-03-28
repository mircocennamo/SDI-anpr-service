package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TSTATOCIVILE", schema = "ANPR")
public class TStatoCivile extends BaseEntityOptionalsFields {

    private static final long serialVersionUID = -1075293348351649796L;
}
