package com.hiren.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hiren.spring.basics.springbasics.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringBasicsApplication {

	//Spring needs following::
	//What are the beans
	//What are the dependencies of a bean?
	//Where to search for the beans?
	
	
	public static void main(String[] args) {
		//BinarySearchImpl binarySerachImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringBasicsApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = 
				applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearchImpl.binarySearch(new int [] { 12, 4, 6 }, 3);
		
		System.out.println(result);
	}
}
