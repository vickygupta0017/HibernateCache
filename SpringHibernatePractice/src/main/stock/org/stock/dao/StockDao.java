package org.stock.dao;

import org.stock.bo.Stock;

public interface StockDao {
	public void saveStock(Stock stock);
	public void updateStock(Stock stock);
	public Stock retrieveStock(int stockId);
	public void deleteStock(Stock stock);
}
