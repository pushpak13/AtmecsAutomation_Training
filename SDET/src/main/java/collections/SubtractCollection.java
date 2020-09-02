package collections;

import java.util.ArrayList;

public class SubtractCollection extends CalculateCollection {
	public void sub(ArrayList<Integer> alist) {

		subtract = alist.get(0);

		for(int index = 0; index < alist.size()-1; index++)
		{
			subtract =subtract - alist.get(index+1);
		}
		System.out.println(subtract);
	}
}
