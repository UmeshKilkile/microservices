package com.comp.cafe.vendor.growfit.vendorservicegrowfit;

import java.util.Arrays;
import java.util.List;

public class Util {

	public static List<Item> getBreakfastItems() {

		List<Item> breakfastItems = Arrays.asList(new Item(1001, "Idly"), new Item(1002, "Vada"),
				new Item(1003, "Pongal"), new Item(1004, "Poori"), new Item(1005, "Alu Paratha"));
		return breakfastItems;
	}

	public static List<Item> getLunchItems() {

		List<Item> lunchItems = Arrays.asList(new Item(1006, "ABCD1"), new Item(1007, "ABCD2"), new Item(1008, "ABCD3"),
				new Item(1009, "ABCD4"), new Item(1010, "ABCD5"));
		return lunchItems;
	}
}
