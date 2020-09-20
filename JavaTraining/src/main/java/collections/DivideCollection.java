package collections;


import java.util.Vector;

public class DivideCollection extends CalculateCollection {
	public void div(Vector<Integer> vector) {

		divide = vector.get(0);

		for(int index = 0; index< vector.size()-1; index++)
		{

			divide = divide / vector.get(index+1);
		} 
		System.out.println(divide);

	}
}
