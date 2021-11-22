
class Employee{
	private String name, address;
	private int yearOfJoining, salary;
	public Employee(String n, int year, int sal, String add){
		name=n;
		yearOfJoining=year;
		salary=sal;
		address=add;
	}
	public String getName(){
		return name;
	}
	public int getYearOfJoining(){
		return yearOfJoining;
	}
	public int getSalary(){
		return salary;
	}
	public String getAddress(){
		return address;
	}
}

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Jane",1992,600000,"32-Wallstreet");
		Employee e2 = new Employee("John",1997,700000,"34-Wallstreet");
		Employee e3 = new Employee("Robert",1999,500000,"36-Wallstreet");
		System.out.println("Name \t Year of joining \t Salary \t Address");
		System.out.println(e1.getName()+ "\t\t"+ e1.getYearOfJoining()+" \t\t\t "+e1.getSalary()+" \t "+e1.getAddress());
		System.out.println(e2.getName()+ "\t\t"+ e2.getYearOfJoining()+" \t\t\t "+e2.getSalary()+" \t "+e2.getAddress());
		System.out.println(e3.getName()+ "\t\t"+ e3.getYearOfJoining()+" \t\t\t "+e3.getSalary()+" \t "+e3.getAddress());

	}

}
