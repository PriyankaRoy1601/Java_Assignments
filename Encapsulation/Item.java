package com.nissan.app;

public class Item {
	public int Itemid;
	public String Name;
	public double Price;
	
	
	public Item(int itemid, String name, double price) {
		super();
		Itemid = itemid;
		Name = name;
		Price = price;
	}


	@Override
	public String toString() {
		return "Item [Itemid=" + Itemid + ", Name=" + Name + ", Price=" + Price + "]";
	}
	
	
}
