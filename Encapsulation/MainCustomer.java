package com.nissan.app;

import java.util.Scanner;

public class MainCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customeraccount c[]=new Customeraccount[10];
		int ch,i=0;
		char choice;
		Scanner sc=new Scanner(System.in);
		do
		{System.out.println("1.Add new customers");
		System.out.println("2.Search details by Account Number");
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		if(ch==1)
			for(int j=0;j<5;j++)
			{c[i]=new Customeraccount();
			 System.out.println("Enter account no:");
			 c[i].Accno=sc.nextLong();
			 System.out.println("Enter name:");
			 c[i].Name=sc.next();
			 System.out.println("Enter Age:");
			 c[i].age=sc.nextShort();
			 System.out.println("Enter Place");
			 c[i].Place=sc.next();
			 System.out.println("Account type(Savings/Fixed)");
			 c[i].AccType=sc.next();
			 i++;}
		else if(ch==2)
		{
			System.out.println("Enter the account no. to be searched:");
			Long temp=sc.nextLong();
			int flag=0;
			for(int j=0;j<i;j++)
				{
				  if(c[j].Accno==temp)
				  {
					  flag=1;
					  System.out.println(c[j]);
					  break;
				  }
				  }
			if(flag==0)
				System.out.println("Account not found");
			}
		System.out.println("Do you want to continue(y/n):");
		choice=sc.next().charAt(0);
		}while(choice=='y'||choice=='Y');

	}

}
