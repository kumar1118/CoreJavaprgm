package com.dev1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSort
{
	public static List<Employee> getEmployees()
	{
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "Komal", new Integer(98000)));
		emp.add(new Employee(109, "chotal", new Integer(88000)));
		emp.add(new Employee(108, "deva", new Integer(18000)));
		emp.add(new Employee(102, "rohit", new Integer(78000)));
		emp.add(new Employee(103, "yuvi", new Integer(28000)));
		emp.add(new Employee(107, "sehwag", new Integer(38000)));
		emp.add(new Employee(105, "esha", new Integer(68000)));
		emp.add(new Employee(104, "tomar", new Integer(58000)));
		emp.add(new Employee(106, "bimal", new Integer(48000)));
		emp.add(new Employee(110, "pikku", new Integer(9000)));	
		return emp;
	}
	public static void main(String[] args)
	{
		List<Employee> list = getEmployees();
		list.sort(Comparator.comparing(Employee:: getId));
		list.forEach(System.out :: println);
		System.out.println("Dscending order");
		list.sort(Comparator.comparing(Employee:: getId).reversed());
		list.forEach(System.out :: println);
	}
}
