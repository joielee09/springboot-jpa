package template.springboot.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import template.springboot.domain.Product;
import template.springboot.dto.ProductRequestData;
import template.springboot.service.ProductServiceImpl;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    private final ProductServiceImpl productServiceImpl;

    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody @Valid ProductRequestData productRequestData){
        Product savedProduct = productServiceImpl.createProduct(productRequestData);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedProduct.getId())
                .toUri();

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(location);

        return ResponseEntity
                .created(location)
                .body(savedProduct);
    }
}
