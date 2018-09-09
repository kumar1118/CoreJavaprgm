package com.dev1;
class Address
{
	private String houseNo;
	private String streetName;
	private String city;
	public Address(String houseNo, String streetName, String city) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
class Student implements Cloneable
{
	private int id;
	private String name;
	private Address address;
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
public class CloneableTest 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Address a1 = new Address("123/A", "5th Cross", "Bangalore");
		Student s1 = new Student(101, "Ganesha", a1);
		Student s2 = (Student)s1.clone();
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println(s2.getAddress().getHouseNo());
		System.out.println(s2.getAddress().getStreetName());
		System.out.println(s2.getAddress().getCity());
	}
}



























