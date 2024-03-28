package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TTIPOCESSAZIONEMATRIMONIO", schema = "ANPR")
public class TTipoCessazioneMatrimonio extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = -6902470429337825204L;
}
