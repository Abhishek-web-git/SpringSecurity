package in.sp.spring;

public class Student{
	private String name;
	private int rollno;
	private String email;
	private Address address;
	public void setName(String name) {
		System.out.println("setter method name");
		this.name = name;
	}
	public void setRollno(int rollno) {
		System.out.println("setter method rollno");
		this.rollno = rollno;
	}
	public void setEmail(String email) {
		System.out.println("setter method email");

		this.email = email;
	}
	public void setAddress(Address address) {
		System.out.println("setter method address");

		this.address = address;
	}
	
	
//	Here we are use Constructor method........................................
//	public Student(String name, int rollno, String email, Address address) {
//		this.name=name;
//		this.rollno=rollno;
//		this.email=email;
//		this.address=address;
//	}
	public void Display() {
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+rollno);		
		System.out.println("Email:"+email);		
		System.out.println("Address:"+address);
	}
}