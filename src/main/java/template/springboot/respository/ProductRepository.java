package template.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import template.springboot.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
