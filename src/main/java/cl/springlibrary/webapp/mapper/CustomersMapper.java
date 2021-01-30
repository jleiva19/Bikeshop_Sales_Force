package cl.springlibrary.webapp.mapper;

import cl.springlibrary.webapp.dto.CustomersDto;
import cl.springlibrary.webapp.entity.sales.Customers;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomersMapper {

    CustomersMapper INSTANCE = Mappers.getMapper(CustomersMapper.class);

    @Mappings({
            @Mapping(target = "customerId", source = "customerId"),
            @Mapping(target = "firstName", source = "firstName"),
            @Mapping(target = "lastName", source = "lastName"),
            @Mapping(target = "phone", source = "phone"),
            @Mapping(target = "email", source = "email"),
            @Mapping(target = "street", source = "street"),
            @Mapping(target = "city", source = "city"),
            @Mapping(target = "state", source = "state"),
            @Mapping(target = "zipCode", source = "zipCode")
    })
    CustomersDto entityToDto(Customers customers);
}
