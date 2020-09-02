package collections;

import java.util.ArrayList;

public class DivideCollection extends CalculateCollection {
	public void div(ArrayList<Integer> alist) {

		divide = alist.get(0);

		for(int index = 0; index< alist.size()-1; index++)
		{

			divide = divide / alist.get(index+1);
		} 
		System.out.println(divide);

	}
}
