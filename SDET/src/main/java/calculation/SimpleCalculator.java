package calculation;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		double num1;
		double num2;
		double ans;
		char op;
		Scanner read = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		num1 = read.nextDouble();
		num2 = read.nextDouble();
		System.out.print("\nEnter an operator (+, -, *, /): ");
		op = read.next().charAt(0);
		switch(op) {
		case '+': ans = num1 + num2;
		break;
		case '-': ans = num1 - num2;
		break;
		case '*': ans = num1 * num2;
		break;
		case '/': ans = num1 / num2;
		break;
		default: System.out.printf("Error! Enter correct operator");
		return;
		}
		System.out.print("\nThe result is given as follows:\n");
		System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
	}
}