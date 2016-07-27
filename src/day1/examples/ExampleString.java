package day1.examples;

public class ExampleString {

	public static void main(String[] args) {
		
		String x = "Henry Mbugua";
		
		//concatenating this string
		System.out.println("Hello " + x);
		
		//concatenating to upper case
		System.out.println(x.toUpperCase());
		
		String age = "37";
		String salary = "30000.5";
		
		//wrapper class
		int a = Integer.parseInt(age)/2;
		System.out.println(a);
		
		double s = Double.parseDouble(salary) * .15;
		System.out.println(s);
		

	}

}
