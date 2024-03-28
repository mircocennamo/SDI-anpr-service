package it.interno.anpr.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;


@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EntityListeners({AuditingEntityListener.class})
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -4316209300615146780L;

    @Id
    @Column(name = "ID", nullable = false, length = 38)
    Long id;

    @Column(name = "DESCRIZIONE", nullable = false, length = 100)
    String descrizione;
}
