package cl.springlibrary.webapp.mapper;

import cl.springlibrary.webapp.dto.CategoriesDto;
import cl.springlibrary.webapp.dto.OrdersDto;
import cl.springlibrary.webapp.entity.production.Categories;
import cl.springlibrary.webapp.entity.sales.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoriesMapper {

    CategoriesMapper INSTANCE = Mappers.getMapper(CategoriesMapper.class);

    @Mappings({
            @Mapping(target = "categoryId", source = "categoryId"),
            @Mapping(target = "categoryName", source = "categoryName")
    })
    CategoriesDto entityToDto(Categories categories);
}
