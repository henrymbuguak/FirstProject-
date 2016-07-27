package day1.exercises;

public class ExerciseB {

	public static void main(String[] args) {
		
		//how to add numbers that are declared as string
		String [] nums = {"10","20","30","40"};
		
		int total = 0;
		//to loop in the above data we use enhanced for loop
		for (String temp : nums) {
			total = total + Integer.parseInt(temp);
		}
		System.out.println("Total = " + total );

	}

}
