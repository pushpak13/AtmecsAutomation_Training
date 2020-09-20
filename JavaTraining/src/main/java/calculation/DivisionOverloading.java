package calculation;

class Division
{
	double div(double num1,double num2)
	{
		return num1/num2;
	}
	double div(double num1,double num2,double num3)
	{
		return num1/num2/num3;
	}
}

public class DivisionOverloading {

	public static void main(String[] args) {

		Division obj = new Division();
		System.out.println("Division of two numbers is" + obj.div(10,0));
		System.out.println("Division of three numbers is" + obj.div(10, 20,30));
	}

}
