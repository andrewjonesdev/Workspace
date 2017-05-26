package getFizzyWithIt;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] hundred = new int [100];
		
		for(int count = 1; count <101; count++){
			if ((count%3==0) && (count%5)==0){
				System.out.println("FizzBuzz");
			}
			else if(count%3==0){
				System.out.println("Fizz");
			}
			else if(count%5==0){
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(count);
			}
		}
	}

}
