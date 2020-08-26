package calculation;

import java.util.Scanner;

public class ExpressionEvaluation extends MenuDrivenForNnumbers {



		static boolean isOperand(char c)
		{
			return (c >= '0' && c <= '9');
		}
		static int operand(char c)
		{
			return (int)(c - '0');
		}
		static int evaluate(String exp)
		{
			if(exp.length() == 0)
				return -1;
			int result = operand(exp.charAt(0));
			for(int index = 1; index < exp.length(); index += 2)
			{
				char opr = exp.charAt(index);
				char opd = exp.charAt(index+1);
				if(isOperand(opd) == false)
					return -1;
				if(opr == '+')
					result = result + operand(opd);
				else if(opr == '-')
					result = result - operand(opd);
				else if(opr == '*')
					result = result * operand(opd);
				else if(opr == '/')
					result = result / operand(opd);
				else
					return -1;
			}
			return result;
		}


		void getResult()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Input your Expression");
			String exp1 = sc.next();
			int result = evaluate(exp1);
			if(result == -1)
			{
				System.out.println("Expression Invalid");
			}
			else
			{
				System.out.println("Value of the expression is " + result);
				System.out.println("========================================");
			}

			sc.close();


		}
	}




