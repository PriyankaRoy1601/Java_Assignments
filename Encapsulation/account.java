package Encapsulation;
//Question 1
import java.util.Scanner;

public class account {

	private double principal;
	private int time;
	private double rate;
	


	public double getPrincipal() {
		return principal;
	}


	public void setPrincipal(double principal) {
		this.principal = principal;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}



	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}


	public void calculateInterest()
	{
		double interest = (principal*time*rate)/100;
		System.out.println("Interest is "+interest);
	}


}
