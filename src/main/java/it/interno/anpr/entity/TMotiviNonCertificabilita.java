package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TMOTIVINONCERTIFICABILITA", schema = "ANPR")
public class TMotiviNonCertificabilita extends BaseEntityStringIdOptionalsFields implements Serializable {

    private static final long serialVersionUID = 7145120948717415675L;
}
