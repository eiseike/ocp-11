package chapter.six.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorFI {
	public static void main(String[] args) {
		Employee adam = new Employee("Adam",100);
		Employee gergo = new Employee("Gergo",111);
		Employee krozus = new Employee("Krozus",999);

		List<Employee> employees = new ArrayList<>();
		employees.add(adam);
		employees.add(krozus);
		employees.add(gergo);

		System.out.println(employees); // [Adam(100), Krozus(999), Gergo(111)]
		Comparator<Employee> compareIt = (a, b) -> a.getSalary()-b.getSalary();
		employees.sort(compareIt);
		System.out.println(employees); // [Adam(100), Gergo(111), Krozus(999)]
	}
}

class Employee {
	private String name;
	private Integer salary;

	public String getName() {
		return name;
	}

	public Integer getSalary() {
		return salary;
	}

	public Employee(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + '(' + salary + ')';
	}
}
