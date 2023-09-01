package com.nissan.app;

import java.util.Scanner;

public class Accountapp {

	
	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a[]=new Account[10];
		char choice='n';
		int ch;
		long acno;
		int index;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Main Menu");
		System.out.println("1.Enter Customer details");
		System.out.println("2.Deposit amount");
		System.out.println("3.Withdraw amount");
		System.out.println("Enter your option");
		ch=sc.nextInt();
		switch(ch)
		{case 2:
			System.out.println("Enter account number:");
			acno=sc.nextLong();
			index=FindIndex(acno,a);
			if(index>=0)
				a[index].deposit();
		    break;
		
		case 3:
			System.out.println("Enter account number:");
			acno=sc.nextLong();
			index=FindIndex(acno,a);
			if(index>=0)
				a[index].withdraw();
		    break;	
		   
		case 1:
			a[i]=new Account();
			System.out.println("Enter Name:");
			a[i].Name=sc.next();
			System.out.println("Enter account no.:");
			a[i].Accno=sc.nextLong();
			System.out.println("Enter Amount:");
			a[i].Amount=sc.nextDouble();
			System.out.println("Details entered");
			i++;
		}
		System.out.println("Do you want to continue:(y/n)?");
		choice=sc.next().charAt(0);
		}while(choice=='Y'||choice=='y');

	}

	private static int FindIndex(long acno,Account a[]) {
		// TODO Auto-generated method stub
		for(int j=0;j<i;j++)
			if(acno==a[j].Accno)
				return j;
		return -1;
	}

}
