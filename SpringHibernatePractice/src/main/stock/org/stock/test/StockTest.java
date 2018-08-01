package org.stock.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.stock.bo.Stock;
import org.stock.dao.StockDao;
import org.stock.service.StockService;
import org.stock.spring.configuration.SpringConfiguration;


public class StockTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		StockService service = context.getBean(StockService.class);
		Stock stock = new Stock(1, "stockName", 100.0, 2, 1000);
		service.createStock(stock);
		
		Stock stock2 =service.retrieveStock(2);
		
		
		Stock stork3 = service.retrieveStock(stock.getStockId());
		System.out.println("stock price "+stock.getMarketprice());
		//it should get the entry from cache now
		// so there should not be any database hit for this
		Stock stork4 = service.retrieveStock(stock.getStockId());
		System.out.println("stock price "+stock.getMarketprice());
	}

}
