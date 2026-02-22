import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i;
		System.out.println("Enter a String: ");
		String str=read.nextLine();
		String reversed="";
		for(i=str.length()-1;i>=0;i--) {
			reversed= reversed+str.charAt(i);
		}
		if(str.equals(reversed)) {
			System.out.println("It is a Palindrome String.");
		}else {
			System.out.println("It is NOT a Palidrome String.");
		}

	}

}
