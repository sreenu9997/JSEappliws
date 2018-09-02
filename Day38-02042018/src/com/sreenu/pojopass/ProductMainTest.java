package com.sreenu.pojopass;

import java.util.ArrayList;

public class ProductMainTest {

	public static void main(String[] args) throws Exception {

		// retrieving one record
		ProductDao productDao = new ProductDao();
		System.out.println("===========retrieving one record=============");
		ProductPojo data = productDao.getProductByID(2);
		System.out.println(data.getId() + " :: " + data.getName() + " :: " + data.getCity());

		System.out.println("=========== All records retrieving =============");
		// retrieving all records
		ArrayList<ProductPojo> array = productDao.getALLProducts();
		int count = 1;
		for (int i = 0; i < array.size(); i++) {
			System.out
					.println(array.get(i).getId() + " :: " + array.get(i).getName() + " :: " + array.get(i).getCity());
			System.out.println(count + " Record ");
			count++;
		}
	}
}
