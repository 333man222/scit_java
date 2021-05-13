package net.scit41.shop.vo;

import java.io.Serializable;

public class ProductVO implements Serializable{
	private String pid;
	private String pname;
	private int unitPrice;
	private int salePrice;
	public ProductVO() {
	}
	public ProductVO(String pid, String pname, int unitPrice, int salePrice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.unitPrice = unitPrice;
		this.salePrice = salePrice;		//1.5배 곱해서 판매
	}
	public String getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public int getSalePrice() {
		return salePrice;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	@Override
	public String toString() {
		return "ProductVO [pid=" + pid + ", pname=" + pname + ", unitPrice=" + unitPrice + ", salePrice=" + salePrice
				+ "]";
	}
	
}
