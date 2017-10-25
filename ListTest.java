package com.exc16_12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		
		String colors[] = {"black","yellow","green","blue","violet","silver"};
		List<String> list1 = new LinkedList<>(Arrays.asList(colors));
		
		String colors2[] = {"gold","white","brown","blue","gray","silver"};
		List<String> list2 = new LinkedList<>(Arrays.asList(colors2));

		list1.addAll(list2);
		list2=null;
		
		printList(list1);
		
		convertToUpperCaseStrings(list1);
		printList(list1);
		
		System.out.println("Deleting elements 4 to 6...");
		removeItems(list1,4,7);
		printList(list1);
		printReversedList(list1);
	}

	private static void printReversedList(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());
		
		System.out.println("Reversed List is:");
		while(iterator.hasPrevious())
		{
			System.out.printf("%s ",iterator.previous());
		}
		System.out.println();
	}

	private static void removeItems(List<String> list, int i, int j) {
		list.subList(i, j).clear();
	}

	private static void convertToUpperCaseStrings(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext())
		{
			String color = iterator.next();
			iterator.set(color.toUpperCase());
		}
		
	}

	private static void printList(List<String> list1) {
		System.out.println("List:");
		for(String color: list1)
		{
			System.out.printf("%s ",color);
		}
		System.out.println();
	}
	

}
