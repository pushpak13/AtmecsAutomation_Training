package collections;


import java.util.Vector;

public class MultiplyCollection extends CalculateCollection {
	public void mul(Vector<Integer> vector) {

		for(int index=0; index < vector.size(); index++)
		{ 

			multiply = multiply * vector.get(index);
		}
		System.out.println(multiply);

	}
}
