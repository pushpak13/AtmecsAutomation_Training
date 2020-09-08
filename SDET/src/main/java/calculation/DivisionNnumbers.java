package calculation;

import java.util.Scanner;

public class DivisionNnumbers  
{
	void getResult()

	{

		Scanner sc = new Scanner(System.in);
		int num,index,index1;
		System.out.println("How many numbers do you want to divide? ");

		num = sc.nextInt();
		double [] divisionArray = new double [num];



		for(index = 0; index < num; index++) {
			System.out.print("Enter " +(index+1)+" numbers: ");
			divisionArray[index] =  sc.nextDouble();
		}



		double result = divisionArray[0];
		for(index1 = 1; index1 < num; index1 ++) 

			result = result / divisionArray[index1];

		System.out.println("Division of all numbers is "+result);

		
	}

}


