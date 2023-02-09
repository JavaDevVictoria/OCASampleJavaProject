package MySampleProject;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
		// Create employees
		Employee e1 = new Employee("John Grennan", 1001, LocalDate.of(1978, 10, 12));
		Employee e2 = new Employee("Rebecca Wilson", 1002, LocalDate.of(1995, 3, 7));
		Employee e3 = new Employee("Amy Kim", 1003, LocalDate.of(1980, 7, 23));

		// Create team
		Employee[] team = {e1, e2};

		// Create Project Manager
		ProjectManager pm = new ProjectManager("Tom Smith", 2001, LocalDate.of(1985, 4, 26), team, "Mobile Responsive Project");

		pm.manage();
		
		// Create Team Manager
		TeamManager tm = new TeamManager("Daisy Johnson", 3001, LocalDate.of(1983, 11, 23), team, "Web Development Team");
		
		tm.manage();
		
		// Create ArrayList of employees
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		// Create department and use polymorphism with the MyPrintable interface
		MyPrintable printable = new Department("Research and Development", pm, employees);
		printable.print();

		// Use exception handling
		try {
			int result = 10/0;  //CHANGE THIS TO SOMETHING RELEVANT
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught: Cannot divide by zero");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException caught!");
		} catch (Exception e) {
			System.out.println("Exception caught!");
		} finally {
			System.out.println("Continuing...");
		}

		// Use StringBuilder - print names on one line 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < employees.size(); i++) {   
			sb.append(employees.get(i).getName() + " ");
		}
		System.out.println(sb.toString());

		// Use lambda expression
		employees.sort((emp1, emp2) -> (emp1.getName()).compareTo(emp2.getName()));
		employees.forEach(emp -> System.out.println(emp.getName()));

		// Use java.time to calculate age of employees
		LocalDate now = LocalDate.now();
		
		// Enhanced for-loop
		for (Employee employee : employees) {
			Period period = Period.between(employee.getDob(), now);
			System.out.println("Age of " + employee.getName() + ": " + period.getYears() + " years");
		}	
		
		// Print employee count using static variable
		System.out.println("Employee count: " + Employee.count);
	}
}
