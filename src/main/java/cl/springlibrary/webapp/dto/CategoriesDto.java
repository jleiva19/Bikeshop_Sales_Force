package cl.springlibrary.webapp.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CategoriesDto {
    @EqualsAndHashCode.Include
    @Getter
    @Setter
    private Integer categoryId;
    @Getter
    @Setter
    private String categoryName;
}
