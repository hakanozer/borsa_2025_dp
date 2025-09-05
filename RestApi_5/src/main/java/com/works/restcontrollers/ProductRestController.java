package com.works.restcontrollers;

import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import com.works.services.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductRestController {

    private final ProductService productService;

    @PostMapping("save")
    public Product save(@Valid @RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("list")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PutMapping("update")
    public Product update(@Valid @RequestBody Product product) {
        return productService.update(product);
    }

}
