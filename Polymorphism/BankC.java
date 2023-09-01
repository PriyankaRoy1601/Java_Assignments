package com.nissan.app;

public class BankC extends Bank{
	public double calculateSimpleInterest(double principal, double rate, double time) {
        return super.calculateSimpleInterest(principal, 7.0, time);
}
}
