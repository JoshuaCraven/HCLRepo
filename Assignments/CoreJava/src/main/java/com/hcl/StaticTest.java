package com.hcl;


class Product {
	int prdId;
	String prdName;
	static String prdLocation="NY";
	public Product(int prdId, String prdName) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
	}
	
	void print() {
		System.out.println(prdId+ " "+ prdName+" "+ prdLocation);
	}
	
}
public class StaticTest {
	
	{
		System.out.println("1");
	}
	static {
		System.out.println("2");
	}
	{
		System.out.println("3");
	}
	public static void main(String[] args) {
		System.out.println("4");
		new StaticTest();
		Product p1=new Product(111,"Laptop");
		Product p2=new Product(112,"Chair");
		p1.print();
		p2.print();
	}

}
