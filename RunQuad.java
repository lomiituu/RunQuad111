package package1;

import java.util.Scanner;

public class RunQuad {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		
		System.out.println("Press R for Rectangle or S for Square: ");
		String usrinput = scn.nextLine();
		
		if(usrinput.equalsIgnoreCase("R")) {
			
			System.out.println("A Rectangle:");
			
			rectangle.showDescription();
			
		} else if(usrinput.equalsIgnoreCase("S")) {
			
			System.out.println("A Square:");
			
			square.showDescription();
		}
		
	}

}
