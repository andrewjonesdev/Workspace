package Suicides;

import java.util.Scanner;

public class PetQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in); 
		String myAnswer = "";
		String firstInitial = "";
		String lastName = "";
		int houseNumber = 0;
		String streetName = "";
		String streetType = "";
		String city = "";
		
		do{
			myAnswer = keyboard.next();
			String[] pieces = myAnswer.split("\\s+");
			firstInitial.equals(pieces[0]);
			lastName.equals(pieces[1]);
			houseNumber=Integer.parseInt(pieces[2]);
			streetName.equals(pieces[3]);
			streetType.equals(pieces[4]);
			city.equals(pieces[5]);
			
			System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
			System.out.println(streetName + " " + streetType + " " + city);
		}while(false);

	}

}
