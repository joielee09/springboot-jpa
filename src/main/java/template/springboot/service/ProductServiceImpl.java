package template.springboot.service;

import com.github.dozermapper.core.Mapper;
import org.springframework.stereotype.Service;
import template.springboot.domain.Product;
import template.springboot.dto.ProductRequestData;
import template.springboot.respository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final Mapper mapper;
    private final ProductRepository productRepository;

    public ProductServiceImpl(Mapper mapper, ProductRepository productRepository) {
        this.mapper = mapper;
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts(){
        return null;
    }

    @Override
    public Product getProduct(Long id) {
        return null;
    }

    @Override
    public Product createProduct(ProductRequestData productRequestData) {

        Product product = mapper.map(productRequestData, Product.class);

        return productRepository.save(product);
    }

    @Override
    public Product updateProduct() {
        return null;
    }

    @Override
    public Product deleteProduct(Long id) {
        return null;
    }

    @Override
    public Product findProduct(Long id) {
        return null;
    }
}
