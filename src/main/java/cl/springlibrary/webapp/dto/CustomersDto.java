package cl.springlibrary.webapp.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CustomersDto {
    @EqualsAndHashCode.Include
    @Getter
    @Setter
    private Integer customerId;
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;
    @Getter
    @Setter
    private String phone;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String street;
    @Getter
    @Setter
    private String city;
    @Getter
    @Setter
    private String state;
    @Getter
    @Setter
    private String zipCode;
}
