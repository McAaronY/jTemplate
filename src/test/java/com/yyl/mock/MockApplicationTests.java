package com.yyl.mock;

import com.yyl.mock.domain.dao.Stock;
import com.yyl.mock.service.StockService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MockApplicationTests {
    @Resource
    StockService stockService;
    @Test
    void contextLoads() {
    }
    @Test
    public void TestAddStock(){
        Stock t = new Stock();
        t.setCode("aaaa");
        stockService.add(t);
        List<Stock> lst = stockService.selectStockAll();
        System.out.println(lst.toString());
    }
}
