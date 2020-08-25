package calculation;

import java.util.Scanner;

public class AdditionOfNnumbers {

	public static void main(String[] args) {
		int index, num1, sum = 0, num;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter how many numbers you want to add ");
		num1 = scan.nextInt();

		System.out.print("Enter " +num1+ " numbers : ");
		for(index=0; index<num1; index++)
		{
			num = scan.nextInt();
			sum = sum + num;
		}

		System.out.print("Sum of all " +num1+ " numbers is " +sum);



	}


}




