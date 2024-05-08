package com.ecommerce.affordmed.ecommerce;

public class Ecommerce {
	
	private String productName;
	private String price;
	private String rating;
	private String discount;
	private String availability;
	
	public Ecommerce() {
		// TODO Auto-generated constructor stub
	}
	

	public Ecommerce(String productName, String price, String rating, String discount, String availability) {
		super();
		this.productName = productName;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
		this.availability = availability;
	}


	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
	

}
