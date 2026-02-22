import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i;
        int num;
        System.out.println("Enter a number: ");
        num=read.nextInt();
        
        System.out.println("Multiplication Table of " +num+ ":");
        
        for(i=1;i<=10;i++) {
        	System.out.println(num+"x"+i+"="+(num*i));
        }
	}

}
