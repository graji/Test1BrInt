package test1brInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Checkout shop system that sells apples and oranges.
 * 
 * The system will request the user to input the products (oranges and apples) they want to buy
 * The products should be indicated in the console, under the pertinent message and split by a ","  
 * 
 * At the end the tilt will show the total amount for the elements being introduced.
 * 
 * * Not case sensitive, example: Orange, orange and ORanGE will be process as the same thing
 * 
 * */

public class firstClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// As I don't know if console is supported I will use the old way by calling a bufferedReader to get the line as a String
		System.out.println("Please, set the elements you want to buy (Oranges and Apples):"); 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		
		//Now that the elements are in the String, I will put them in a List<String>
		List<String> list = new ArrayList<>(Arrays.asList(str.split(",")));
		
		//Calculate the totalAmount of shopping
		double totalAmount = 0.0;
		for(String prod : list){
			if(prod.trim().equalsIgnoreCase("orange")){
				totalAmount += 0.25;
			}else if(prod.trim().equalsIgnoreCase("apple")){
				totalAmount += 0.60;
			}
		}
		
		//Currency result
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("Total: "+currency.format(totalAmount));
	}

}
