package com.hiren.spring.basics.springbasics.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort (int[] numbers) {
		//Logic for quick sort
		return numbers;
	}
}
