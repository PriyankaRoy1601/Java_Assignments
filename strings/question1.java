package strings;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=scan.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++){ 
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				sum+=(str.charAt(i)-'0');
			}
		}
		System.out.println("Sum of all digits in the string " +sum );

	}

}
