package com.yyl.mockservice.impl;


import com.yyl.mockdao.StockRepository;
import com.yyl.mockentity.Stock;
import com.yyl.mockservice.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service(value = "stockService")
public class StockServiceImpl implements StockService {


     private  StockRepository stockRepository;
     @Autowired
     public StockServiceImpl(StockRepository stockRepository){
         this.stockRepository=stockRepository;
     }

    @Override
    public Stock add(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock update(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public void delete(Stock stock) {
        stockRepository.delete(stock);
    }

    @Override
    public List<Stock> selectStockAll() {
       return StreamSupport.stream(stockRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }
}
