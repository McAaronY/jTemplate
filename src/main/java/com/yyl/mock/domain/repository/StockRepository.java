package com.yyl.mock.domain.repository;

import com.yyl.mock.domain.dao.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface StockRepository extends CrudRepository<Stock,Long> {
}
