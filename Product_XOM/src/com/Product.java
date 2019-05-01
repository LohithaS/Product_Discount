package com;

import java.util.List;

public class Product {
	public List<items> items;
	// List<Integer> priceList;
	public String id;

	// public int originalPrice;

	public int discountCheck(List<items> items) {
		int actualPrice = 0;

		for (items i : items) 
		{
			if (!i.itemName.isEmpty() && i.quantity > 0) {

				actualPrice=actualPrice+ (i.price * i.quantity);
				// actualPrice = i.price;
			}
			/*if (actualPrice > 0)

			{
				itemsPrice = itemsPrice + actualPrice;

			}*/
		}

		return actualPrice;

	}
}
