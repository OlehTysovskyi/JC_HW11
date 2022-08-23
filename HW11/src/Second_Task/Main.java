package Second_Task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String [] materials = {"Default leather", "Alkantara", "Elephant leather", "Crocodile leather", "LuisVuiton leather", "Gucci leather"};	
		
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println(
					"=============================================" + "\n" + "-Press '0' to create new Array of Cars" + "\n" + "-Press '1' to exit");
			int arrCreateKey = scn.nextInt();

			try {
				if (arrCreateKey == 0) {
					System.out.println("Array was created successfully");

					Random rnd = new Random();
					int arrSize1 = rnd.nextInt(2 - 1) + 1;
					int arrSize2 = rnd.nextInt(3 - 1) + 1;	
					
					Car[][] Cars = new Car[arrSize1][arrSize2];
					for (int i = 0; i < arrSize1; i++) {
						for (int j = 0; j < arrSize2; j++) {
							Cars[i][j] = new Car(rnd.nextInt(601 - 1) + 100,
												rnd.nextInt(32 - 1) + 1990,
												new Helm(rnd.nextInt(4-1)+15, materials[rnd.nextInt(6-1)]),
												new Engine(rnd.nextInt(14-1)+2));
						}
					}
					
					while (true) {
						System.out.println("-Press '1' to see all Array values" + "\n"
								+ "-Press '2' to fill all objects with the same car" + "\n" 
								+ "-Press '3' to exit");
						int consoleKey = scn.nextInt();
						
						if (consoleKey == 1) {
							System.out.println(Arrays.deepToString(Cars));
						} 
						else if (consoleKey == 2) { 
							for(int i=0; i<arrSize1; i++) {
								Arrays.fill(Cars[i], new Car(500, 2017, new Helm(21, "Crocodile leather"), new Engine(16)));
							}
							System.out.println(Arrays.deepToString(Cars));
						} 
						else if (consoleKey == 3) {
							break;
						} 
						else throw new IllegalStateException();
					}
				} 
				else if (arrCreateKey == 1) {
					break;
				} 
				else throw new IllegalStateException();
			} 
			catch (IllegalStateException e) {
				System.err.println("You entered wrong number");
			}

			
		}
		
	}
}
