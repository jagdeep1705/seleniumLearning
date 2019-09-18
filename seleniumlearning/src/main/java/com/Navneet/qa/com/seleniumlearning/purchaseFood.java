package com.Navneet.qa.com.seleniumlearning;

import java.util.HashMap;
import java.util.Scanner;

public class purchaseFood {
	
	static double purchase_limit_perDay = 50;
	//static int size;

	private static Scanner in;

	public static void main(String[] args) {
		
		HashMap<String, Double> itemlist = new HashMap<String, Double>();
		itemlist.put("pizzas",4.55);
		itemlist.put("icecream_tubs", 1.00);
		itemlist.put("chicken_chips",6.00);
		itemlist.put("biryani",7.00);
		//size=itemlist.size();
		double total=0.0;
		System.out.println("Enter the number of items you wish to buy : ");
		for(String i:itemlist.keySet())
		{
			System.out.print(i+" = ");
			in = new Scanner(System.in);
			//nextLine() is used to read a string
			int s = in. nextInt();
			total=total + (s*itemlist.get(i));
			System.out. println("You entered "+s+" "+i);
			System.out.println("Total Amount = "+total);
			if (total > purchase_limit_perDay)
			{
				System.out.println("Sorry your per day purchase limit is Pound "+purchase_limit_perDay);
				break;
			}
			else
			{System.out.println("Please make the payment of pound "+total); }
			//checkTotal(total,count);
		}
		
		

	}
	

}
