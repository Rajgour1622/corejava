package second;

public class palindrome {
	public static void main(String[]args) {
		int num=121,reminder,reversed=0;
		int original=num;
		while (num != 0) {
		      reminder = num % 10;
		      reversed = reversed * 10 + reminder;
		      num /= 10;
		    }
		if(original==reversed) {
			System.out.println("number is palindrome");
			
		}
		else
			System.out.println("num is not palindrome");
			
	}
	

}
