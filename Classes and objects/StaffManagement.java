package Class_and_objects;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StaffManagement {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<StaffDetails> sd = new ArrayList<StaffDetails>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opt;
		do {
			System.out.println("Choose an option");
			System.out.println("1-Add Staff");
			System.out.println("2-Delete");
			System.out.println("3-Search");
			System.out.println("4-List Staff");
			System.out.println("5-Exit");
			System.out.print("Option : ");
			opt = scan.nextInt();
			if(opt==1)
				add();
			else if(opt==2)
				delete();
			else if(opt==3)
				search();
			else if(opt==4)
				list();
		}while(opt!=5);
	}
	private static void list() {
		// TODO Auto-generated method stub
		System.out.println("Staff Details - ");
		for(int i=0;i<sd.size();i++)
			System.out.println(sd.get(i).toString());
	}
	private static void search() {
		// TODO Auto-generated method stub
		System.out.print("Enter the Employee ID : ");
		String id = scan.next();
		for(int i=0;i<sd.size();i++) {
			if(sd.get(i).getId().equals(id)) {
				System.out.println(sd.toString());
				return;
			}
		}
		System.out.println("Record not found...");
	}
	private static void delete() {
		// TODO Auto-generated method stub
		System.out.print("Enter the Employee ID : ");
		String id = scan.next();
		for(int i=0;i<sd.size();i++) {
			if(sd.get(i).getId().equals(id)) {
				sd.remove(i);
				System.out.println("Record Deleted....");
				return;
			}
		}
		System.out.println("Record not found...");
	}
	private static void add() {
		// TODO Auto-generated method stub
		char ch;
		do {
			StaffDetails staff = new StaffDetails();
			System.out.print("Enter the name : ");
			staff.setName(checkName(scan.next()));
			System.out.print("Enter the Age : ");
			staff.setAge(scan.nextInt());
			System.out.print("Enter the Phone : ");
			staff.setPhone(scan.nextLong());
			System.out.print("Enter the Salary : ");
			staff.setSalary(scan.nextInt());
			System.out.print("Enter the Address : ");
			staff.setAddress(scan.next());
			String id = "NS"+staff.getName().substring(0,3);
			staff.setId(id);
			sd.add(staff);
			System.out.print("Do you want to add more?(y/n) : ");
			ch = scan.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
	}
	
	private static String checkName(String name) {
		// TODO Auto-generated method stub
		try {
			//create object for buffered reader
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//create pattern using regular expression
			Pattern pattern = Pattern.compile("[^A-Za-z ]");
			do {
				//match
				Matcher matcher = pattern.matcher(name);
				boolean finder = matcher.find();
				//find method returns false if string matches the pattern
				if(finder) {
					System.out.println("Name must contain only alphabets please re-enter!");
					name = br.readLine();
				}else if(name.length()<3){
					System.out.println("Name must be atlease 3 letters please re-enter!");
					name = br.readLine();
				}else if(name.length()>30){
					System.out.println("Name must not be longer than 30 letters please re-enter!");
					name = br.readLine();
				}else {
					break;
				}
			}while(true);
		}catch(Exception e ) {
			System.out.println(e);
		}
		return name;
	}

}