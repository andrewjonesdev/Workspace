package getFizzyWithIt;

public class FizzBuzzOptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] hundred = new int [100];
		String fizzBuzz = "FizzBuzz";
		
		for(int count = 1; count <101; count++){
			if ((count%3==0) && (count%5)==0){
				System.out.println(fizzBuzz);
			}
			else if(count%3==0){
				System.out.println(fizzBuzz.substring(0, 4));
			}
			else if(count%5==0){
				System.out.println(fizzBuzz.substring(4, fizzBuzz.length()));
			}
			else{
				System.out.println(count);
			}
		}
	}

}
