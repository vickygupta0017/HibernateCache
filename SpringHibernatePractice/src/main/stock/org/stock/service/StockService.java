package org.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.stock.bo.Stock;
import org.stock.dao.StockDao;

@Component
public class StockService {
	
	@Autowired
	StockDao dao;

	public void createStock(Stock stock) {
		dao.saveStock(stock);
		System.out.println("record saved");
	}
	
	public void updateStock(Stock stock) {
		dao.updateStock(stock);
	}
	public Stock retrieveStock(int stockId) {
		return dao.retrieveStock(stockId);
	}
	public void deleteStock(Stock stock) {
		dao.deleteStock(stock);
	}

}
