package template.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import template.springboot.domain.Item;
import template.springboot.domain.Product;
import template.springboot.dto.ProductRequestData;
import template.springboot.service.StockService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SampleController {

    private final StockService stockService;

    @Autowired
    public SampleController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("home")
    public String helloSample(@RequestParam(value = "data", required = false) String data, Model model){
        model.addAttribute("data", data);
        return "index";
    }

    @GetMapping("stock")
    @ResponseBody
    public List<Item> getStock(){ return stockService.getStock(); }

    @GetMapping("item")
    @ResponseBody
    public List<Item> getItem(@RequestParam(value = "id", required = true) Integer id){
        return stockService.getItem(id);
    }
}
