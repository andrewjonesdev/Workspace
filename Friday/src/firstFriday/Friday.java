package firstFriday;

import java.util.Scanner;

public class Friday {
	
	public static void main(String[] args) {
		
	int customerID = 0;
	String customerName = "";
	double salesAmount = 0.0;
	String taxCode = "";
	double taxPercent = 0.0;
	double tax = 0.0;
	double total = 0.0;
	boolean keepGoing = false;


	boolean again = false;
	String yesOrNo = "";
	Scanner numScan = new Scanner(System.in);
	Scanner strScan = new Scanner(System.in);
	
		do{
			//set to negatives so the default will kick the Birthday inputs back to the start if non integers are entered
	
			customerID = -10;
			salesAmount = -10;
			
			
			//Day Input
			do{
				keepGoing = false;
				System.out.println("Enter a Customer ID: ");
				//checks if letters are input
				if (numScan.hasNextInt()){
					customerID = numScan.nextInt();
					//checks if the day is valid
					if(customerID < 0){
						System.out.println("The Customer ID you entered wasn't valid. Please try again.");					
					}
	
					
					
				}
				else{
					System.out.println("You didn't submit a whole number. Please try again.");
					numScan.next();
					keepGoing = true;
					continue;
				}
			}while((customerID < 0));
			do{
				keepGoing = false;
				System.out.println("Enter your Name: ");
				//checks if letters are input
				//if (numScan.hasNext()){
					customerName = strScan.nextLine();
					//checks if the day is valid
					if(customerName.length() < 2){
						System.out.println("The month you entered wasn't valid. Please try again.");
						keepGoing = true;
					}
					
					else{
						keepGoing = false;
					}	
			}while(keepGoing);
			do{
				keepGoing = false;
				System.out.println("Enter a sales amount: ");
				//checks if letters are input
				if (numScan.hasNextDouble()){
					salesAmount = numScan.nextDouble();
					//checks if the day is valid
					if(salesAmount < 0){
						System.out.println("The sales amount you entered wasn't valid. Please try again.");					
					}
	
					
					
				}
				else{
					System.out.println("You didn't submit a number. Please try again.");
					numScan.next();
					keepGoing = true;
					continue;
				}
			}while((salesAmount < 0));
			do{
				keepGoing = false;
				System.out.println("Enter a tax code: ");
				//checks if letters are input
				//if (numScan.hasNext()){
					taxCode = strScan.nextLine();
					taxCode = taxCode.toUpperCase();
					//checks if the day is valid
					if(taxCode.length() != 3){
						System.out.println("The tax code you entered wasn't valid. Please try again.");
						keepGoing = true;
					}
					else if(taxCode.equals("NRM")){
						taxPercent = .06;
						
					}
					//checks if the day exists in this month
					else if(taxCode.equals("NPF")){
						taxPercent = 0;
					}
					else if(taxCode.equals("BIZ")){
						taxPercent = .045;
					}
					else{
						System.out.println("You didn't submit a valid 3 letter tax code. Please try again.");
						keepGoing = true;
					}		//}
			/*else{
				System.out.println("You didn't submit a valid 3 letter month abreviation. Please try again.");
				keepGoing = true;
			}*/
			}while(keepGoing);
			//tax = salesAmount * taxPercent;
			total = salesAmount * (1 + taxPercent);
			total = (int)(total*100 + .5)/100.0;
			salesAmount = (int)(salesAmount*100 + .5)/100.0;
			//tax = (int)(tax*100 + .5)/100.0;
			tax = (int)((total - salesAmount)*100)/100.0;
			System.out.println("Customer ID: " + customerID + " \nCustomer Name: " + customerName + " \nSales Amount: $" + salesAmount + " \nTax Code: "+ taxCode + " \n" + taxCode +" Rate: " + (taxPercent*100) + "% \nTax : "+ tax +" \nTotal Amount Due: $" + total);
			
			/*do{
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
			*/
			
		}while(letsGoAgain(yesOrNo, again, strScan));
		numScan.close();
		strScan.close();
	
	}
	
	public static boolean letsGoAgain(String yesOrNo, boolean again, Scanner strScan){
		do{
			System.out.println("Do you want to continue? Y or N");
			yesOrNo = strScan.nextLine();
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
		
		return again;
	}

}
