package strings;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner scan=new Scanner(System.in);
		String finalString = "NULL";
		System.out.print("Enter String : ");
		String s=scan.nextLine();
		int length = s.length();
		for (int i = length / 2; i > 0; i--) {
            String prefix = s.substring(0, i);
            String suffix = s.substring(length - i);
                       
            if (prefix.equals(suffix)) {
                finalString = prefix;
                flag++;
                break;
            }
        }
		if(flag==0)
            	System.out.println("No common end substring found.");
		else
			System.out.println("Longest common end substring: "+finalString);
	}

}
