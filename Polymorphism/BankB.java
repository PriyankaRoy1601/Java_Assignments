package com.nissan.app;

public class BankB extends Bank {
	
	public double calculateSimpleInterest(double principal, double rate, double time) {
        return super.calculateSimpleInterest(principal, 9.0, time);
    }
}
