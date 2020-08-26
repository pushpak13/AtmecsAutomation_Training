package calculation;

import java.util.Scanner;

public class SubtractNnumbers extends MenuDrivenForNnumbers {
	void getResult()

	{

		Scanner sc = new Scanner(System.in);
		int result=0;
		int num1 ;
		int index ;
		int num[] = new int[10];

		System.out.println("Enter the number of values you want to Subtract: ");
		num1 = sc.nextInt();
		System.out.println("Input "+num1+" values");
		for(index=0;index<num1;index++)
		{
			num[index]=sc.nextInt();
		}

		result = num.length>0 ? num[0] : 0;
		for ( index = 1; index< num.length; index++ ) {
			result = result -  num[index];
		}
		System.out.println("Subtraction of all numbers is "+result);





	}

}
