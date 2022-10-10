package entity;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "productcategory")
public class ProductCategory extends BaseModel {

    @Column(name = "description")
    @NotNull
    private String description;

}
