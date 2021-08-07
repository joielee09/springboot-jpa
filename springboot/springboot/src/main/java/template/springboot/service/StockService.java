package template.springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import template.springboot.domain.Item;
import template.springboot.respository.StockRepository;

import java.util.List;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<Item> getStock() { return stockRepository.getStock(); }
}
