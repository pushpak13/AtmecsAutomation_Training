package calculation;

class Addition
{
	int add(int num1,int num2)
	{
		return num1 + num2;
	}
	int add(int num1,int num2,int num3)
	{
		return num1 + num2 + num3;
	}
}

public class AdditionOverloading {

	public static void main(String[] args) {

		Addition obj = new Addition();
		System.out.println("Addition of two numbers is" + obj.add(10,20));
		System.out.println("Addition of three numbers is" + obj.add(10, 20,30));



	}


}




