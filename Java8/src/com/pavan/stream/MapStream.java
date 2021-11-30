package com.pavan.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapStream {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1,"pavan","ece",200);
		Employee emp2 = new Employee(2,"pavani","eee",300);
		Employee emp3 = new Employee(3,"ram","ece",400);
		Employee emp4 = new Employee(4,"raju","eee",600);
		Employee emp5 = new Employee(5,"ekta","mec",700);
		
		Map<Integer,Employee> map = new HashMap<>();
		map.put(1, emp1);
		map.put(2, emp2);
		map.put(3, emp3);
		map.put(4, emp4);
		map.put(5, emp5);
		
		map.entrySet().stream().filter(e -> e.getValue().getEmpName().equals("pavan")).forEach(System.out::println);
		map.values().stream().filter(e -> e.getEmpName().equals("pavan")).forEach(System.out::println);
	//map.values().stream().filter(e -> e.getEmpName()=="pavan").forEach(System.out::println);
		//map.values().stream().forEach(System.out::println);
		
		List<Employee> allEmployees = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
			
		allEmployees.forEach(System.out::println);
		
		System.out.println("=======================");
		
		Map<Integer,String> employeeMap = allEmployees.stream().collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName));
		employeeMap.forEach((k,v) -> System.out.println(k+","+v));
		
		Map<String, Employee> topEmployees = allEmployees.stream().collect(Collectors.groupingBy(e -> e.getDept(), 
				Collectors.collectingAndThen( Collectors.maxBy(Comparator.comparingInt(e -> e.getEmpSalary())), Optional::get) ));
		
		topEmployees.forEach((k,v) -> System.out.println(k+","+v.getEmpName()+","+v.getEmpSalary()));
		
		System.out.println("=======================");

		
		
		allEmployees.stream().filter(e -> e.getEmpName().startsWith("p")).forEach(System.out::println);
		
		System.out.println("=======================");
		
		allEmployees.stream().filter(e -> e.getEmpName().startsWith("p")).filter(e -> e.getEmpSalary()>200).forEach(System.out::println);
		
		System.out.println("=======================");

		allEmployees.stream().map(e -> e.getEmpName()).forEach(System.out::println);
		
		System.out.println("=======================");
		
		List<Character> list = Arrays.asList('p','a','v','a','n');
		
		"pavan".toCharArray();
		
		list.stream().collect(Collectors.groupingBy(e-> e,Collectors.counting())).forEach((k,v) -> System.out.println(k+","+v));
		
		
		// to find count a character
		long charCount = "pavan".chars().filter(ch -> ch=='a').count();
		System.out.println(charCount);
		
		long charCount2 = "pavan".codePoints().filter(ch -> ch=='p').count();
		System.out.println(charCount2);
		
		"pavan".codePoints().mapToObj(Character::toString).collect(Collectors.groupingBy(e -> e,Collectors.counting())).forEach((k,v) -> System.out.println(k+","+v));
		
		
		

	}
	
}

class Employee{
	
	int empId;
	String empName;
	String dept;
	int empSalary;
	
	public Employee(int empId, String empName, String dept,int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.empSalary = empSalary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + ", empSalary=" + empSalary
				+ "]";
	}

}