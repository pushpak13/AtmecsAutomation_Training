package collections;


import java.util.Scanner;
import java.util.Vector;

public class CalculateCollection {


	static int input1;
	static int number;
	int sum=0,subtract=0,multiply=1;
	int divide;
	static String operation;
	static String input;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Vector<Integer> vector = new Vector<Integer>(); 
		System.out.println("Enter number of input :");
		number = sc.nextInt();
		System.out.println("Enter the input:");
		for(int index = 0; index < number; index++)
		{
			input1 = sc.nextInt();
			vector.add(input1);

		}

		System.out.println("Enter the operation you want to perform: + - * /");

		operation = sc.next();
		if (operation.equals("+")) {
			AddCollection a = new AddCollection();
			a.add(vector);
		}
		else if (operation.equals("-")) {
			SubtractCollection s = new SubtractCollection();
			s.sub(vector);

		} else if (operation.equals("*")) {
			MultiplyCollection m = new MultiplyCollection();
			m.mul(vector);

		} 
		else {
			DivideCollection d = new DivideCollection();
			d.div(vector);
		}

		sc.close();


	}

}
