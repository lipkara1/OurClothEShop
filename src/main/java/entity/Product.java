package entity;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
@SequenceGenerator(name = "idGenerator", sequenceName = "PRODUCTS_SEQ", initialValue = 1, allocationSize = 1)
public class Product extends BaseModel {

    @Column(length = 30, nullable = false, unique = true)
    @NotNull
    private String serial;

    @Column(length = 50, unique = false)
    @NotNull
    private String name;

    @Column(precision = 10, scale = 2, nullable = false)
    @NotNull
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @NotNull
    private ProductCategory category;

}
