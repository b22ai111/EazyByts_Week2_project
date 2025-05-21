package com.yourapp.controller;

import com.yourapp.model.Stock;
import com.yourapp.service.TradingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TradingController {

    @Autowired
    private TradingService tradingService;

    @PostMapping("/trade/buy")
    public String buyStock(@RequestParam String symbol) {
        return tradingService.buyStock(symbol);
    }

    @GetMapping("/portfolio")
    public List<Stock> getPortfolio() {
        return tradingService.getPortfolio();
    }
}
