package com.hcl.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Test1");
		set.add(new String("Test2"));
		set.add(new String("Test3"));
		set.add("Test3");
		
		
		Iterator<String> itr=set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
		
		
		

	}

}
}