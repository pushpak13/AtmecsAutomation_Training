package collections;



import java.util.Vector;


public class AddCollection extends CalculateCollection {
	public void add(Vector<Integer> vector) {

		for(int index = 0; index < vector.size(); index++)
		{ 

			sum = sum + vector.get(index);
		}
		System.out.println(sum);

	}
}
