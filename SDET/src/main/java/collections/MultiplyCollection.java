package collections;

import java.util.ArrayList;

public class MultiplyCollection extends CalculateCollection {
	public void mul(ArrayList<Integer> alist) {

		for(int index=0; index < alist.size(); index++)
		{ 

			multiply = multiply * alist.get(index);
		}
		System.out.println(multiply);

	}
}
