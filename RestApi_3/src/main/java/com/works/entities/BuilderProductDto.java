package com.works.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
//@AllArgsConstructor
//@Entity
public class BuilderProductDto {

    @NotNull
    @NotEmpty
    private String name;

    private String description;
    private String color;
    private Integer size;
    private Integer kg;


}
