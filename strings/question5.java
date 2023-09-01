package strings;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String newString="";
		System.out.print("Enter String : ");
		String s=scan.nextLine();
		int index = s.indexOf('#');
		char[] string = s.toCharArray();
		for(int i=index-1;i<string.length-3;i++)
			string[i]=string[i+3];
		for(int i=0;i<string.length-3;i++)
			newString+=string[i];

		System.out.println("The final string is "+newString);
	}

}
