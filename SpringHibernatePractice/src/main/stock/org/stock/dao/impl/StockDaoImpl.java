package org.stock.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import org.stock.bo.Stock;
import org.stock.dao.StockDao;

@Repository
public class StockDaoImpl implements StockDao{

	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	@Override
	public void saveStock(Stock stock) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(stock);
		tx.commit();
		session.close();
	}

	@Override
	public void updateStock(Stock stock) {
		Session session = factory.openSession();
		session.update(stock);
		session.close();
		
	}

	@Override
	public Stock retrieveStock(int stockId) {
		Session session = factory.openSession();
		Stock stock = session.get(Stock.class, stockId);
		session.close();
		return stock;
		
	}

	@Override
	public void deleteStock(Stock stock) {
		Session session = factory.openSession();
		session.delete(stock);
		session.close();
		
	}
}
