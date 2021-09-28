package second;

public class Checkprime {
	public static void main(String[]args) {
		int num=15;
		boolean check=false;
		for(int i=2;i<=num/2;i++){
			if(num%i==0);{
				check=true;
				
				break;
				
			}
			
			
		}
		if(!check)
			System.out.println(num+"is prime number");
		else
			System.out.println(num+" is not a prime number");
	}

}
