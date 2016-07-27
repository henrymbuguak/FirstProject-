package day1.examples;

public class ExampleArrays {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,40,50};
		
		System.out.println(a[2] +  " " + a[4]);
		
		//enhanced for statement
		for (int temp : a) {
			System.out.println(temp);
		}
		// creating new array with no values
		System.out.println("----------------");
		int [] x = new int[5];
		
		//assigning values to the given slot in the array
		x[3] = 30;
		x[0] = 25;
		
		for (int temp2 : x) {
			System.out.println(temp2);
		}

	}

}
