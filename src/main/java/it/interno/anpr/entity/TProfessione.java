package it.interno.anpr.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "TPROFESSIONE", schema = "ANPR")
public class TProfessione extends BaseEntityStringIdOptionalsFields implements Serializable {

    private static final long serialVersionUID = -3283015613697501949L;

}

