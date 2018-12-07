package com.comp.cafe.vendor.growfit.vendorservicegrowfit;

import java.io.Serializable;

/**
 * @author ukilkil
 *
 */

public class ItemWithPrice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8392880839357735921L;
	private String name;
	private Long price;

	public ItemWithPrice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemWithPrice(String name, Long price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemWithPrice [name=" + name + ", price=" + price + "]";
	}
}
