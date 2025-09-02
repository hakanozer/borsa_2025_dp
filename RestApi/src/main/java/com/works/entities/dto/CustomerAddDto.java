package com.works.entities.dto;

import com.works.entities.Customer;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Customer}
 */
@Value
public class CustomerAddDto implements Serializable {
    @NotNull
    @Size(min = 3, max = 100)
    @NotEmpty
    String name;
    @NotNull
    @Size(min = 5, max = 20)
    @Email
    @NotEmpty
    String email;
    @NotNull
    @Size(min = 3, max = 15)
    @NotEmpty
    String password;
}