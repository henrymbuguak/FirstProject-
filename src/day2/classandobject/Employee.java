package day2.classandobject;

public class Employee {
	//concept of class and object
	
	double salary;
	double bonus;
	
	void calculateTotalPay() {
		double totalPay = salary + bonus;
		System.out.println("Total = " + totalPay);
	}

}
