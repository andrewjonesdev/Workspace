package easyMode;

import java.util.Scanner;

public class ComparingStrings {

    public static void main(String []args){
    	String yesOrNo = "";
    	boolean again = false;
    	String answer = "";
        Scanner sc = new Scanner(System.in);
        do{
        	answer = "";
	        do{
		        System.out.println("How is the weather?");
		        answer = sc.nextLine();
		        answer = answer.toLowerCase();
		        if (answer == "rain")
		            System.out.println("Take your umbrella!");
		        else if (answer == "windy")
		            System.out.println("Wear your jacket!");
		        else if (answer == "snow" )
		            System.out.println("Wear a coat and take a shovel!");
		        else if (answer == "stormy" )
		            System.out.println("You should stay inside!");
		        else
		            System.out.println("Enjoy your day!");
	        }while(false);
			do{
				System.out.println("Do you want to continue? Y or N");
				yesOrNo = sc.nextLine();
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
    sc.close();
     }


}
