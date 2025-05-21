package com.yourapp.service;

import com.yourapp.model.Stock;
import com.yourapp.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradingService {

    @Autowired
    private StockRepository stockRepo;

    public String buyStock(String symbol) {
        Stock stock = new Stock();
        stock.setSymbol(symbol);
        stock.setQuantity(1); // default 1 for now
        stockRepo.save(stock);
        return "Bought stock: " + symbol;
    }

    public List<Stock> getPortfolio() {
        return stockRepo.findAll();
    }
}
