package com.comp.cafe.priceservice;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRICE_MASTER")
public class ItemPrice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8958987574586097273L;

	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private long price;

	public ItemPrice() {
		super();
	}

	public ItemPrice(Integer id, long price) {
		super();
		this.id = id;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
}
