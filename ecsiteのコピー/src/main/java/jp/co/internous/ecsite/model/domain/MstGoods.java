package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class MstGoods {
	
	private int id;
	private String goodsName;
	private int price;
	private Timestamp createdAt;
    private Timestamp updateAt;
    
    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
    public String getGoodsName() {
    	return goodsName;
    }
    public void setGoodsName(String goodsName) {
    	this.goodsName = goodsName;
    }
    public int getPrice() {
    	return price;
    }
    public void setPrice(int price) {
    	this.price = price;
    }
    public Timestamp getCreatesAt() {
    	return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
    	this.createdAt = createdAt;
    }
    public Timestamp getupdateAt() {
    	return updateAt;
    }
    public void setUpdateAt(Timestamp updateAt) {
    	this.updateAt = updateAt;
    }
}
