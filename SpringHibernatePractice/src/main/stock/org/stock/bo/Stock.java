package org.stock.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Stock {
	@Id
	private int stockId;
	@Column
	private String stockName;
	@Column
	private double marketprice;
	@Column
	private double faceValue;
	@Column
	private int totalQuantity;
	public Stock(){}
	public Stock(int stockId, String stockName, double marketprice, double faceValue, int totalQuantity) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.marketprice = marketprice;
		this.faceValue = faceValue;
		this.totalQuantity = totalQuantity;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public double getMarketprice() {
		return marketprice;
	}
	public void setMarketprice(double marketprice) {
		this.marketprice = marketprice;
	}
	public double getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(double faceValue) {
		this.faceValue = faceValue;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	
}
