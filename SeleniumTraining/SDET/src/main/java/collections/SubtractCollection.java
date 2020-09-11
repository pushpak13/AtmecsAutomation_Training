package collections;


import java.util.Vector;

public class SubtractCollection extends CalculateCollection {
	public void sub(Vector<Integer> vector) {

		subtract = vector.get(0);

		for(int index = 0; index < vector.size()-1; index++)
		{
			subtract =subtract - vector.get(index+1);
		}
		System.out.println(subtract);
	}
}
