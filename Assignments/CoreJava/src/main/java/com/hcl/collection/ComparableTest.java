package com.hcl.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

class Product implements Comparable<Product>{
	int prdId;
	String prdName;
	int prdPrice;

	public int compareTo(Product p) {
		if(prdPrice==p.prdPrice) {
		return 0;
		}
		else if(prdPrice>p.prdPrice) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}

public class ComparableTest {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(111, "Laptop", 1000));
		list.add(new Product(112, "Desktop", 500));
		list.add(new Product(113, "Mouse", 10));
		
		Collections.sort(list);
		list.forEach(System.out::println);
	}

}
