package MySampleProject;

import java.util.ArrayList;

class Department implements MyPrintable {
    private String name;
    private Manager manager;
    private ArrayList<Employee> employees;

    public Department(String name, Manager manager, ArrayList<Employee> employees) {
        this.name = name;
        this.manager = manager;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public Manager getManager() {
        return manager;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void print() {
        System.out.println("Department Name: " + name);
        System.out.println("Manager: " + manager.toString());
        System.out.println("Employees: ");
        employees.forEach(employee -> System.out.println(employee.toString()));
    }
}
