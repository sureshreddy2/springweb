package com.jasmine.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int customerid;
	private String customername;
	private long mobileno;
	private String productname;
	private double price;
	private int quantity;
	private double total;
	private double discount;
	private double gst_amt;
	private double invoice_bill;
	
	public Product() {
		super();
	}

	public Product(int customerid, String customername, long mobileno, String productname, double price,
			int quantity, double total, double discount, double gst_amt, double invoice_bill) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.mobileno = mobileno;
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.discount = discount;
		this.gst_amt = gst_amt;
		this.invoice_bill = invoice_bill;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getGst_amt() {
		return gst_amt;
	}

	public void setGst_amt(double gst_amt) {
		this.gst_amt = gst_amt;
	}

	public double getInvoice_bill() {
		return invoice_bill;
	}

	public void setInvoice_bill(double invoice_bill) {
		this.invoice_bill = invoice_bill;
	}

	@Override
	public String toString() {
		return "Product [customerid=" + customerid + ", customername=" + customername + ", mobileno=" + mobileno
				+ ", productname=" + productname + ", price=" + price + ", quantity=" + quantity + ", total=" + total
				+ ", discount=" + discount + ", gst_amt=" + gst_amt + ", invoice_bill=" + invoice_bill + "]";
	}

}