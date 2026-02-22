import java.util.Scanner;
public class SumTillZero {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		int sum=0;
		System.out.println("Enter Number: ");
		while(true) {
			num=read.nextInt();
			if(num==0) {
				break;
			}
			sum=sum+num;
		}
		System.out.println("Total Sum: "+sum);
		
	}

}
