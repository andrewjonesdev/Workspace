package MowMowMowYourBoat;

import java.util.Scanner;

public class MowingActivity {
	
	public static void main(String[] args) {
		
	int length = 0;
	int width = 0;
	boolean keepGoing = false;
	boolean again = false;
	String yesOrNo = "";
	int area = 0;
	double time = 0.0;
	int minutes = 0;
	int hours = 0;
	Scanner numScan = new Scanner(System.in);
	Scanner strScan = new Scanner(System.in);
	
		do{
			//set to negatives so the default will kick the Birthday inputs back to the start if non integers are entered
	
			length = -10;
			width = -10;
			
			//Day Input
			do{
				keepGoing = false;
				System.out.println("Enter a length: ");
				//checks if letters are input
				if (numScan.hasNextInt()){
					length = numScan.nextInt();
					//checks if the day is valid
					if(length < 0){
						System.out.println("The length you entered wasn't valid. Please try again.");					
					}
	
					
					
				}
				else{
					System.out.println("You didn't submit a whole number. Please try again.");
					numScan.next();
					keepGoing = true;
					continue;
				}
			}while((length < 0));
			do{
				keepGoing = false;
				System.out.println("Enter a width: ");
				//checks if letters are input
				if (numScan.hasNextInt()){
					width = numScan.nextInt();
					//checks if the day is valid
					if(width < 0){
						System.out.println("The width you entered wasn't valid. Please try again.");					
					}
	
					
					
				}
				else{
					System.out.println("You didn't submit a whole number. Please try again.");
					numScan.next();
					keepGoing = true;
					continue;
				}
			}while((width < 0));
			area = length * width;
			time = (double)area / 20.0;
			hours = (int)time / 60;
			minutes = (int)time % 60;
			System.out.println("Length: " + length + " yards\nWidth: " + width + " yards\nSquare Yardage: " + area + " square yards\nHours: "+ hours +" hours\nMinutes: " + minutes + " minutes");
			
			do{
				System.out.println("Do you want to continue? Y or N");
				yesOrNo = strScan.next();
				//in case the user types "y" or "n" it will still go through
				yesOrNo = yesOrNo.toUpperCase();
				if(yesOrNo.equals("Y")){
					again = true;
				}
				else if(yesOrNo.equals("N")){
					again = false;
				}
				else{
					System.out.println("You didn't type \"Y\" or \"N\". please try again");
				}
				
			}while((!(yesOrNo.equals("Y"))) && (!(yesOrNo.equals("N"))));
		}while(again);
		numScan.close();
		strScan.close();
	
	}

}