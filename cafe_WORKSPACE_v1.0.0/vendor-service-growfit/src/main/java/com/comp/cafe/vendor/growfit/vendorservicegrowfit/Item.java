package com.comp.cafe.vendor.growfit.vendorservicegrowfit;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ukilkil
 *
 */
@Entity
@Table(name = "ITEM_GROWFIT")
public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8958987574586097273L;

	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String name;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
}
