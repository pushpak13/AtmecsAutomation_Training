package calculation;

import java.util.Scanner;

public class AdditionOfNnumbers  {
	void getResult()

	{
		int index, num1, result = 0, num;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter how many numbers you want to add ");
		num1 = scan.nextInt();

		System.out.print("Enter " +num1+ " numbers : ");
		for(index=0; index<num1; index++)
		{
			num = scan.nextInt();
			result = result + num;
		}

		System.out.print("Sum of all " +num1+ " numbers is " +result);

		

	}


}




