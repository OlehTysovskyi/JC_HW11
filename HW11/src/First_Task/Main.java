package First_Task;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Integer[] arrayInt = new Integer [10];		
		
		Random rnd = new Random();
		
		for(int i=0; i<arrayInt.length; i++) {
			arrayInt[i] = rnd.nextInt(51-1)+1;
		}
		System.out.println("-Filled with random values:" + "\n" + Arrays.toString(arrayInt));
		
		Arrays.sort(arrayInt);
		System.out.println("-Sorted asc:" + "\n" + Arrays.toString(arrayInt));
		
		Arrays.sort(arrayInt, Collections.reverseOrder());
		System.out.println("-Sorted desc:" + "\n" + Arrays.toString(arrayInt));
	}


}
