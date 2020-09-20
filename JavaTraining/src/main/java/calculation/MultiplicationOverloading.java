package calculation;

class Multiply
{
	int mul(int num1,int num2)
	{
		return num1 * num2;
	}
	int mul(int num1,int num2,int num3)
	{
		return num1 * num2 * num3;
	}
}

public class MultiplicationOverloading {

	public static void main(String[] args) {

		Multiply obj = new Multiply();
		System.out.println("Multiplication of two numbers is" + obj.mul(10,20));
		System.out.println("Multiplication of three numbers is" + obj.mul(10, 20,30));
	}

}
