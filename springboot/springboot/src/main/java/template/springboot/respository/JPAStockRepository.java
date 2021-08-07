package template.springboot.respository;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import template.springboot.domain.Item;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class JPAStockRepository implements StockRepository{

    private final EntityManager em;

    @Autowired
    public JPAStockRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Item> getStock() {
        String hql = "FROM STOCK";
        List<Item> result = em.createNativeQuery("SELECT * FROM STOCK", Item.class)
                .getResultList();
        System.out.println(result);
        return result;
    }
}
