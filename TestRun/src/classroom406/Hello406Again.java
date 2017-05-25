package classroom406;

import java.util.Scanner;

public class Hello406Again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello 406 Again");
		Scanner scannerInput = new Scanner(System.in);
		if (scannerInput.hasNextInt()){
			int randomNumber = scannerInput.nextInt();
			switch(randomNumber){
			
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
				System.out.println("Your number is too low");
				break;
			
			}
			
		}
		else{
			System.out.println("You didn't submit a whole number. Please try again.");
			scannerInput.next();
			//continue;
		}
		
		
		scannerInput.close();
	}

}
