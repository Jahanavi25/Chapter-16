package com.exc16_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountingLetters {

	public static void main(String[] args) {
		Map<Character, Integer> myMap = new HashMap<>();
		createMap(myMap);
		displayMap(myMap);
	}

	private static void createMap(Map<Character,Integer> map)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a string: ");
		String input = sc.nextLine();
		
		String[] tokens = input.split(" ");
		for(String token: tokens)
		{
			String word = token.toLowerCase();
			for(int i=0;i<word.length();i++)
			{
				Character letter = word.charAt(i);
				if(map.containsKey(letter))
				{
					int count = map.get(letter);
					map.put(letter, count+1);
				}
				else
					map.put(letter,1);
			}
		}
		sc.close();
	}
	
	private static void displayMap(Map<Character,Integer> map)
	{
		Set<Character> keys = map.keySet();
		TreeSet<Character> sortedKeys = new TreeSet<>(keys);
		
		System.out.printf("%nMap contains:%nKey\t\tValue%n");
		
		for(Character key : sortedKeys)
		{
			System.out.printf("%-10s%10s%n",key,map.get(key));
		}
		System.out.printf("%nsize: %d%nisEmpty :%b%n",map.size(),map.isEmpty());
	}
}
