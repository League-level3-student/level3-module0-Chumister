package _03_More_Array_Fun;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
	public static void main(String[] args) {
		
		String[] array = new String[] {"1","2","3","4","5"};
for (int i = array.length-1; i >= 0; i--) {
	
	System.out.println(array[i]);
		}

	for (int i = 0; i < 5 ; i++) {
		if (i%2==0) {
			System.out.println(array[i]);
		}
	}	
	for (int i = 0; i < array.length; i++) {
		ArrayList<String> list= new ArrayList<String>();

		Random random = new Random(i);
		if (random == i) {
		System.out.println(array[i]);
	}	
	}
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array in reverse order.
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}
