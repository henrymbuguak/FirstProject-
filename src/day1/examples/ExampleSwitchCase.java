package day1.examples;

public class ExampleSwitchCase {

	public static void main(String[] args) {
		
		int h = 2;
		
		switch (h) {
		
		case 0:
			System.out.println("The value is 0.");
			break;
		case 1:
			System.out.println("The value is one.");
			break;
		case 2:
			System.out.println("The value is two.");
			break;
		case 3:
			System.out.println("The value is three.");
			default :
				System.out.println("No value");
				break;
		}

	}

}
