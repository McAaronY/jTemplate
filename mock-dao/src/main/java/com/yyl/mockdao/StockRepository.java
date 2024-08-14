package com.yyl.mockdao;

import com.yyl.mockentity.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock,Long> {

}
