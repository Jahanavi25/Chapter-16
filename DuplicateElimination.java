package com.exc16_13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElimination {

	public static void main(String[] args) {
		Set<String> firstNamesSet = new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many first names you have: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" names");
		for(int i=0;i<n;i++)
		{
			firstNamesSet.add(sc.next());
		}
		System.out.println("First Names saved in a set");
		
		System.out.println("Do you want to search for a first name (Y/N): ");
		String resp=sc.next();
		while(resp.equalsIgnoreCase("y"))
		{
			System.out.println("Enter the name to search: ");
			String searchName=sc.next();
			if(searchFirstName(firstNamesSet, searchName))
			{
				System.out.println(searchName+" found in the set");
			}
			else
			{
				System.out.println(searchName+" not found in the set");
			}
			System.out.println("Do you want to search another first name (Y/N): ");
			resp=sc.next();
		}
		System.out.println("Thank you!");
		sc.close();
	}
	public static boolean searchFirstName(Set<String> fNameSet,String searchName)
	{
		for(String fName:fNameSet)
		{
			if(fName.equals(searchName))
			{
				return true;
			}
		}
		return false;
	}
}
