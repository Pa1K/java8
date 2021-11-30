
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeleteEmployee {

	/*
	 * TODO:2
	 * 
	 * Write a deleteEmployee method to delete employee from employees based on
	 * passed employeeId with below conditions.
	 * 
	 * Conditions: 1. Should not use java8 concepts. 2. Delete employee from
	 * existing list. 3. It should not generate any intermediate collection object.
	 * 4. Employee class is yours, you can do anything inside of employee class
	 * while following Employee class conditions.
	 */

	static void deleteEmployee(List<Organization.Employee> employees, String id) {

		Iterator<Organization.Employee> itr = employees.iterator();
		while (itr.hasNext()) {
		Organization.Employee emp = itr.next();
			if (emp.id.equals(id)) {
				itr.remove();
			}
		}

	}

	/**
	 * Create a list of dummy unique employees and return them from here.
	 * 
	 * @return list of unique employee
	 */

	private static List<Organization.Employee> getEmployees() {

		List<Organization.Employee> employees = new ArrayList<>();
		// TODO:1 Create a list of unique employees and return them here.



		employees.add(new Organization().new Employee("1", "pavan", "kari", 26));
		employees.add(new Organization().new Employee("2", "ram", "raju", 27));
		employees.add(new Organization().new Employee("3", "krishna", "kumar", 30));

		return employees;

	}

	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		String employeeId = args[0];
		List<Organization.Employee> employees = getEmployees();

		// TODO:3
		/**
		 * Step1: Trigger delete employee method with arguments employees and
		 * employeeId.
		 * 
		 * Step2: Print remaining employee's ids using custom functional interface as a
		 * lamda expression in streams.
		 */

		deleteEmployee(employees, employeeId);
		employees.forEach(System.out::println);
	}
}

class Organization {
	/**
	 * Conditions:
	 * 
	 * 1. No Setters & Getters in Employee class.
	 */
	class Employee {

		public String id;
		private String firstName;
		private String lastName;
		private int age;

		Employee() {

		}

		Employee(String id, String firstName, String lastName, int age) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
		}

	}
}
