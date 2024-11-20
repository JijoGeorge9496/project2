package Calculator;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num1 = 10;
    int num2 = 20;
    int sum = num1 + num2;
    // Version1 1.0
    System.out.println(num1);
	System.out.println(num2);
	System.out.println(sum);
	
	// Version 2.0
	System.out.println(num1 + num2 + sum);
	
	// Version 3.0
	 System.out.println("Num1: " + num1);
	 System.out.println("Num2: " + num2);
	 System.out.println("Sum: " + sum);
	 
	 // Version 4.0
	 System.out.printf("Num1: %d\n Num2: %d\n Sum: %d\n",
	         num1, num2, sum);
	}

}