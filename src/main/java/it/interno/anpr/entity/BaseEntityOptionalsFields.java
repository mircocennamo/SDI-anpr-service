package it.interno.anpr.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EntityListeners({AuditingEntityListener.class})
public class BaseEntityOptionalsFields extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -4249765653532406076L;

    @Column(name = "ORDINAMENTO", columnDefinition = "CHAR", length = 2)
    Short ordinamento;

    @Column(name = "DATAINIZIOVALIDITA")
    LocalDate dataInizioValidita;

    @Column(name = "DATAFINEVALIDITA")
    LocalDate dataFineValidita;
}
