package com.dev1;

public class Employee 
{
	private int id;
	private String name;
	private Integer salaries;
	public Employee(int id, String name, Integer salaries) {
		super();
		this.id = id;
		this.name = name;
		this.salaries = salaries;
	}
	@Override
	public String toString() {
		return "(" + id + "	  :" + name + "	:" + salaries + ")";
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
	public Integer getSalaries() {
		return salaries;
	}
	public void setSalaries(Integer salaries) {
		this.salaries = salaries;
	}
}
