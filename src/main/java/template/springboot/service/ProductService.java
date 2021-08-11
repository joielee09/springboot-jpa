package template.springboot.service;

import template.springboot.domain.Product;
import template.springboot.dto.ProductRequestData;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProduct(Long id);

    Product createProduct(ProductRequestData productRequestData);

    Product updateProduct();

    Product deleteProduct(Long id);

    Product findProduct(Long id);
}
