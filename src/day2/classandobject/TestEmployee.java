package day2.classandobject;

public class TestEmployee {

	public static void main(String[] args) {
		//we are going to create object of employee
		Employee james, henry, alice;
		
		james = new Employee();
		henry = new Employee();
		alice = new Employee();
		
		james.salary = 90000;
		james.bonus  = 20000;
		james.calculateTotalPay();
		
		henry.salary = 100000;
		henry.bonus  = 25000;
		henry.calculateTotalPay();
		
		alice.salary = 96000;
		alice.bonus  = 15000;
		alice.calculateTotalPay();
		

	}

}
