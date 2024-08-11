package com.yyl.mock.service.impl;

import com.yyl.mock.domain.dao.Stock;
import com.yyl.mock.domain.repository.StockRepository;
import com.yyl.mock.service.StockService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service(value = "stockService")
public class StockServiceImpl implements StockService {
    @Resource
    StockRepository stockRepository;

    @Override
    public Stock add(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock update(Stock stock) {
        return null;
    }

    @Override
    public Stock delete(Stock stock) {
        return null;
    }

    @Override
    public List<Stock> selectStockAll() {
        return StreamSupport.stream(stockRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }
}
