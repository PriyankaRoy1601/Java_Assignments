package com.nissan.app;

public class Customeraccount {
	public long Accno;
	public String Name;
	public short age;
	public String Place,AccType;
	
	public Customeraccount() {
		
	}

	@Override
	public String toString() {
		return "Customeraccount [Accno=" + Accno + ", Name=" + Name + ", age=" + age + ", Place=" + Place + ", AccType="
				+ AccType + "]";
	}
	
	

}
