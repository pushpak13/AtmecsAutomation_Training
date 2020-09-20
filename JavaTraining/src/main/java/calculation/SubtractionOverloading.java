package calculation;

class Subtract
{
	int sub(int num1,int num2)
	{
		return num1 - num2;
	}
	int sub(int num1,int num2,int num3)
	{
		return num1 - num2 - num3;
	}
}

public class SubtractionOverloading {

	public static void main(String[] args) {

		Subtract obj = new Subtract();
		System.out.println("Subtraction of two numbers is" + obj.sub(10,20));
		System.out.println("Subtraction of three numbers is" + obj.sub(10, 20,30));
	}

}
