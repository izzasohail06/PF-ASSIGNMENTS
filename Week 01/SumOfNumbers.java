import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		int sum=0;
		int digit;
		System.out.println("Enter a number: ");
		num=read.nextInt();
		 while(num>0) {
			 digit=num%10;
			 sum=sum+digit;
			 num=num/10;
		 }
		 System.out.println("Sum Of Numbers : "+sum);

	}

}
