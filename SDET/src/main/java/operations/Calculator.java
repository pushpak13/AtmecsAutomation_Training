package operations;

import java.util.Scanner;

public class Calculator extends Divide
{
	float num1,num2,result;


	void read(Calculator obj1) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Value for Variable 1 : ");
		obj1.num1 = sc.nextFloat();
		System.out.print("\nPlease enter Value for Variable 2 : ");
		obj1.num2 = sc.nextFloat();


	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calculator obj = new Calculator();
		for(;;) {
			System.out.println("\nPlease select the operation:\n1: Add\n2: Sub\n3: Mul\n4: Div \n5:Exit\n\n Waiting for input : ");
			int choice = in.nextInt();
			if(choice==5) {
				System.out.println("Exiting system");
				System.exit(0);  
			}


			switch(choice)
			{
			case 1: obj.read(obj);
			obj.result =  obj.add(obj.num1, obj.num2);
			System.out.println("Result : " + obj.result);
			break;
			case 2: obj.read(obj);
			obj.result = obj.sub(obj.num1, obj.num2);
			System.out.println("Result : " + obj.result);
			break;
			case 3: obj.read(obj);
			obj.result = obj.mul(obj.num1, obj.num2);
			System.out.println("Result : " + obj.result);
			break;
			case 4: obj.read(obj);
			obj.result = obj.div(obj.num1, obj.num2);
			System.out.println("Result : " + obj.result);
			break;
			default : System.out.println("Invalid Choice\n");
			}

		}
	}
}
