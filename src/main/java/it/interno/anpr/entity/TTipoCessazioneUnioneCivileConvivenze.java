package it.interno.anpr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TTIPOCESSAZIONEUNIONECIVILECONVIVENZE", schema = "ANPR")
public class TTipoCessazioneUnioneCivileConvivenze extends BaseEntityOptionalsFields implements Serializable {

    private static final long serialVersionUID = 2166173380857073068L;
}
