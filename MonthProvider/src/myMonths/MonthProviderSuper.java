package myMonths;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class MonthProviderSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentMonth = 0;
		String selectedMonthAbr = "";
		int selectedMonth = 0;
		String yesOrNo = "";
		boolean again = false;
		boolean keepGoing = false;
		LocalDate date = LocalDate.now();
		Month stringMonth = date.getMonth();
		currentMonth = stringMonth.getValue();
		Scanner numScan = new Scanner(System.in);
		Scanner strScan = new Scanner(System.in);
		//System.out.println(currentMonth==5);
		
		//do{
			
			do{
				//set to negatives so the default will kick the Birthday inputs back to the start if non integers are entered

				selectedMonth = -10;
				
				//Day Input
				do{
					keepGoing = false;
					System.out.println("Enter a month (ex. January = 1 or Jan): ");
					//checks if letters are input
					if (numScan.hasNextInt()){
						selectedMonth = numScan.nextInt();
						//checks if the day is valid
						if(selectedMonth < 1 || selectedMonth > 13){
							System.out.println("The month you entered wasn't valid. Please try again.");
							//numScan.next();
							keepGoing = true;
							continue;
						}
						else if((selectedMonth == 1)||(selectedMonth == 3)||(selectedMonth == 5)||(selectedMonth == 7)||(selectedMonth == 8)||(selectedMonth == 10)||(selectedMonth == 12)){
							System.out.println("Month " + selectedMonth + " has 31 days.");
						}
						//checks if the day exists in this month
						else if((selectedMonth == 4)||(selectedMonth == 6)||(selectedMonth == 9)||(selectedMonth == 11)){
							System.out.println("Month " + selectedMonth + " has 30 days.");
						}
						else if(selectedMonth == 2){
							System.out.println("Month " + selectedMonth + " has 28 days and 29 on leap year.");
						}
					}
					else{
						selectedMonthAbr = selectedMonthAbr.toUpperCase();
						if(selectedMonthAbr.length() != 3){
							System.out.println("The month you entered wasn't valid. Please try again.");
							numScan.next();
							keepGoing = true;
							continue;
						}
						else if((selectedMonthAbr.equals("JAN"))||(selectedMonthAbr.equals("MAR"))||(selectedMonthAbr.equals("MAY"))||(selectedMonthAbr.equals("JUL"))||(selectedMonthAbr.equals("AUG"))||(selectedMonthAbr.equals("OCT"))||(selectedMonthAbr.equals("DEC"))){
							System.out.println("Month " + selectedMonthAbr + " has 31 days.");
						}
						//checks if the day exists in this month
						else if((selectedMonthAbr.equals("APR"))||(selectedMonthAbr.equals("JUN"))||(selectedMonthAbr.equals("SEP"))||(selectedMonthAbr.equals("NOV"))){
							System.out.println("Month " + selectedMonthAbr + " has 30 days.");
						}
						else if(selectedMonthAbr.equals("FEB")){
							System.out.println("Month " + selectedMonthAbr + " has 28 days and 29 on leap year.");
						}
						else{
							//System.out.println("You didn't submit a valid 3 letter month abreviation. Please try again.");
							System.out.println("You didn't submit a valid Month. Please try again.");
							numScan.next();
							keepGoing = true;
							continue;
						}
					}
					/*else{
						System.out.println("You didn't submit a valid Month. Please try again.");
						numScan.next();
						keepGoing = true;
						continue;
						
					}*/
				}while(keepGoing);
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
