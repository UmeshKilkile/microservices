/**
 * 
 */
package com.comp.cafe.vendor.growfit.vendorservicegrowfit;

import java.io.Serializable;
import java.util.List;

/**
 * @author ukilkil
 *
 */
public class Data implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9149128013919568617L;

	public List<Item> data;

	public Long count;

	public Data() {

	}

	public Data(List<Item> data, Long count) {
		super();
		this.data = data;
		this.count = count;
	}

	public List<Item> getData() {
		return data;
	}

	public void setData(List<Item> data) {
		this.data = data;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Data [data=" + data + ", count=" + count + "]";
	}
}