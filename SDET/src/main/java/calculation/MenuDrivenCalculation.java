package calculation;

import java.util.*;

public class MenuDrivenCalculation {

	public static void main(String[] args) throws InvalidInputException {
		double num1,num2,exit;
		int option;
		do
		{

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice from the following menu:");
			System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
			option = sc.nextInt();
			if(option!=5) {
				System.out.println("Enter the first number");
				num1 = sc.nextInt();
				System.out.println("Enter the second number");
				num2 = sc.nextInt();
			}
			else
				break;
			switch(option)
			{
			case 1:System.out.println("Addition of two numbers is"  +(num1+num2));
			break;
			case 2:System.out.println("Subtraction of two numbers is" +(num1-num2));
			break;
			case 3:System.out.println("Multiplication of two numbers is" +(num1*num2));
			break;
			case 4:
				try {
					if(num2==0)
						throw new InvalidInputException("Division by zero not possible.");
					System.out.println("Division of two numbers is" +(num1/num2));
				}
				catch(InvalidInputException e)
				{
					System.out.println(e);
				}
				break;
			case 5: break;
			default: System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue?1.Yes 2.No");
			exit = sc.nextInt();
		}while(exit==1);                                 
	}


}















