package Class_and_objects;

public class StaffDetails {
	private String name, address, id;
	private long phone;
	private int salary,age;
	public StaffDetails() {
		this.name = "NULL";
		this.address = "NULL";
		this.id = "NULL";
		this.phone = 0;
		this.salary = 0;
		this.age = 0;
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "StaffDetails [name=" + name + ", address=" + address + ", id=" + id + ", phone=" + phone + ", salary="
				+ salary + ", age=" + age + "]";
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
