package collections;


import java.util.ArrayList;


public class AddCollection extends CalculateCollection {
	public void add(ArrayList<Integer> alist) {

		for(int index = 0; index < alist.size(); index++)
		{ 

			sum = sum + alist.get(index);
		}
		System.out.println(sum);

	}
}
