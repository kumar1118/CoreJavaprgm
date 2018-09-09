package com.dev1;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetSort 
{
	public static void main(String[] args) 
	{
		Set<Employee> emp = new TreeSet<>(Comparator.comparing(Employee:: getName));
		emp.add(new Employee(109, "chotal", new Integer(88000)));
		emp.add(new Employee(108, "deva", new Integer(18000)));
		emp.add(new Employee(102, "rohit", new Integer(78000)));
		emp.add(new Employee(103, "yuvi", new Integer(28000)));
		emp.add(new Employee(107, "sehwag", new Integer(38000)));
		emp.add(new Employee(105, "esha", new Integer(68000)));
		emp.add(new Employee(104, "tomar", new Integer(58000)));
		emp.add(new Employee(106, "bimal", new Integer(48000)));
		emp.add(new Employee(110, "pikku", new Integer(9000)));	
		emp.forEach(System.out:: println);
		System.out.println("Descending order");
		Set<Employee> emp1 = new TreeSet<>(Comparator.comparing(Employee:: getName).reversed());
		emp1.add(new Employee(109, "chotal", new Integer(88000)));
		emp1.add(new Employee(108, "deva", new Integer(18000)));
		emp1.add(new Employee(102, "rohit", new Integer(78000)));
		emp1.add(new Employee(103, "yuvi", new Integer(28000)));
		emp1.add(new Employee(107, "sehwag", new Integer(38000)));
		emp1.add(new Employee(105, "esha", new Integer(68000)));
		emp1.add(new Employee(104, "tomar", new Integer(58000)));
		emp1.add(new Employee(106, "bimal", new Integer(48000)));
		emp1.add(new Employee(110, "pikku", new Integer(9000)));	
		emp1.forEach(System.out:: println);
	}
}
