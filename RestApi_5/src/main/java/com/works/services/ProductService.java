package com.works.services;

import com.works.aspect.LogExecution;
import com.works.entities.Product;
import com.works.observer.OrderService;
import com.works.repositories.ProductRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    final ProductRepository productRepository;
    final HttpServletRequest req;
    final OrderService orderService;


    public Product save(Product product) {
        req.getSession().setAttribute("userid", 1);
        int id = (int) req.getSession().getAttribute("userid");
        product.setUserID(id);
        return productRepository.save(product);
    }

    @LogExecution
    public List<Product> findAll() {
        int id = (Integer) req.getSession().getAttribute("userid");
        orderService.createNewOrder();
        return productRepository.findByUserIDEquals(id);
    }

    // update product
    public Product update(Product product) {
        int id = (Integer) req.getSession().getAttribute("userid");
        Optional<Product> optionalProduct = productRepository.findByUserIDEqualsAndPidEquals(id, product.getPid());
        if (optionalProduct.isPresent()) {
            return productRepository.save(product);
        }
        return null;
    }

}
