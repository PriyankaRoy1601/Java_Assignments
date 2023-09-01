package Encapsulation;
//QUestion 1
import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your type of account:");
		System.out.println("1.Fixed 2.Savings");
		int ch = scan.nextInt();
		account a1 = new account();
		System.out.println("Enter the principal:");
		a1.setPrincipal(Double.parseDouble(scan.next()));
		System.out.println("Enter the time:");
		a1.setTime(Integer.parseInt(scan.next()));
		if(ch==1)
		{
			a1.setRate(11);
		}
		else
		{
			a1.setRate(4);
		}
		
		a1.calculateInterest();
		
		

	}

}
