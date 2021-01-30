package cl.springlibrary.webapp.entity.production;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@NoArgsConstructor
@Table(name = "categories")
public class Categories {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "category_id")
    private Integer categoryId;
    @Getter
    @Setter
    @Column(name = "category_name")
    private String categoryName;

    public Categories(String categoryName) {
        this.categoryName = categoryName;
    }
}
