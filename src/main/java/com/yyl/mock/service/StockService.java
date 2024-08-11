package com.yyl.mock.service;

import com.yyl.mock.domain.dao.Stock;

import java.util.List;

public interface StockService {
    Stock add(Stock stock);

    Stock update(Stock stock);

    Stock delete(Stock stock);

    List<Stock> selectStockAll();
}
