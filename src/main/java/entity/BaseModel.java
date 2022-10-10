package entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@ToString
@MappedSuperclass
public abstract class BaseModel implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idGenerator")
    @Column(updatable = false)
    private Long id;


}
