package cl.springlibrary.webapp.entity.production;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Table(name = "brands")
public class Brands {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "brand_id")
    private Integer brandId;
    @Getter
    @Setter
    @Column(name = "brand_name")
    private String brandName;

    public Brands(String brandName) {
        this.brandName = brandName;
    }
}
