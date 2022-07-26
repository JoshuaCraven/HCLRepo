package com.hcl.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	//

	public static void main(String[] args) {
		List<String> linked=new LinkedList<>();
		linked.add("Justin");
		linked.add("John");
		linked.add("Justin");
		linked.add("Ryyan");
		Iterator<String> itr=linked.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());

        }

	}
}