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
 * * Only orange and apple will be processed!! whatever other input won't be processed
 * 
 * */

public class firstClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str ="";
		
		// As I don't know if console is supported I will use the old way by calling a bufferedReader to get the line as a String
		System.out.println("Please, set the elements you want to buy (Oranges and Apples):"); 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		str = reader.readLine();
		
		//Please comment the above line and uncomment below lines to apply the fixed tests, instead of inserting elements through console
		/*
		 * test 1: 
		 * str = "Apple, Orange, Apple, Apple";
		 * 
		 * test 2: 
		 * str = "apple, APPLE, orange, ORANGe, ApPLe, AppLE, ORANge";
		 * 
		 * test 3:
		 * str = "apple,APPLE,orange,ORANGe,ApPLe,AppLE,ORANge"; 
		 * 
		 * test 4: 
		 * str = "Apple, Orange, banana, melon, Apple, Apple, strawberry";
		 * 
		 * test 5: 
		 * str = "1, Orange, 5, melon, ####&&££, Apple, strawberry, !!!546&^%£";
		 * 
		 * */

		//Now that the elements are in the String, I will put them in a List<String>
		List<String> list = new ArrayList<>(Arrays.asList(str.split(",")));
		
		//Calculate the totalAmount of shopping
		double totalAmount = 0.0;
		int numOranges=1;
		int numApples=1;
		for(String prod : list){
			if(prod.trim().equalsIgnoreCase("orange")){
				if(numOranges==3){
					numOranges=1;
				}else{
					numOranges +=1;
					totalAmount += 0.25;
				}
			}else if(prod.trim().equalsIgnoreCase("apple")){
				if(numApples==2){
					numApples=1;
				}else{
					numApples +=1;
					totalAmount += 0.60;
				}
			}
		}
		
		//Currency result
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("Total: "+currency.format(totalAmount));
	}

}
