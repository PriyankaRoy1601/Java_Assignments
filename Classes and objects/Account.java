package com.nissan.app;

import java.util.Scanner;

public class Account {

	public double Amount;
	public String Name;
	public long Accno;
	
	public void deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be deposited:");
		double am=sc.nextDouble();
		this.Amount=this.Amount+am;		
		System.out.println(this);
	}
	
	public void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn:");
		double am=sc.nextDouble();
		if(this.Amount-am<0)
			System.out.println("Cannot withdraw. Less than zero balance");
		else
			this.Amount=this.Amount-am;
		System.out.println(this);
		
		
	}

	@Override
	public String toString() {
		return "Account [Amount=" + Amount + ", Name=" + Name + ", Accno=" + Accno + "]";
	}
	
}
