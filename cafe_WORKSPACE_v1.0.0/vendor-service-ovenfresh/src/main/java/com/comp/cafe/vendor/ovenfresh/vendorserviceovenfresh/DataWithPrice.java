/**
 * 
 */
package com.comp.cafe.vendor.ovenfresh.vendorserviceovenfresh;

import java.io.Serializable;
import java.util.List;

/**
 * @author ukilkil
 *
 */
public class DataWithPrice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9149128013919568617L;

	public List<ItemWithPrice> data;

	public Integer count;

	public DataWithPrice(List<ItemWithPrice> data, Integer count) {
		super();
		this.data = data;
		this.count = count;
	}

	public DataWithPrice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<ItemWithPrice> getData() {
		return data;
	}

	public void setData(List<ItemWithPrice> data) {
		this.data = data;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "DataWithPrice [data=" + data + ", count=" + count + "]";
	}
}