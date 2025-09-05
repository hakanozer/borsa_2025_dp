package com.works.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.apache.catalina.security.SecurityUtil;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    @NotNull
    @NotEmpty
    private String title;
    private Integer price;
    private Integer userID;
    //private String userName = SecurityContextHolder.getContext().getAuthentication().getName();

}
