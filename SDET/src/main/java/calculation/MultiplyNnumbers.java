package calculation;

import java.util.Scanner;

public class MultiplyNnumbers  {
	void getResult()

	{
		int index,num1,result=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements u want to multiply : ");
		num1 = sc.nextInt();

		int Array[] = new int[num1];

		System.out.println("Enter your elements below :---- \n");
		for(index=0;index<num1;index++)
		{
			System.out.print("Enter "+(index+1)+" Element : ");
			Array[index] = sc.nextInt();
			result = result * Array[index];
		}
		System.out.println("Multiplication of elements is:" +result);

	}

}
