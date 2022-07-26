package com.hcl;

public class Static {
	static int y=0;
	Static(){
		y++;
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		Static s1=new Static();
		Static s2=new Static();
		Static s3=new Static();
				
	}

}
