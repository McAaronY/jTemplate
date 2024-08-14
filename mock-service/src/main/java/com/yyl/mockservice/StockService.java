package  com.yyl.mockservice;


import com.yyl.mockentity.Stock;

import java.util.List;

public interface StockService {
    Stock add(Stock stock);

    Stock update(Stock stock);

    void delete(Stock stock);

    List<Stock> selectStockAll();
}
