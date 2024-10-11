package com.github.bruce_mig.jte_forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private Long id;
    @NotBlank(message = "The First Name field should be blank.")
    private String firstName;
    @NotBlank(message = "The Last Name field should be blank.")
    private String lastName;
    private String email;
    private String country;
    private String streetAddress;
    private String city;
    private String region;
    private String postalCode;
}
