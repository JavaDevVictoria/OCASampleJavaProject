package MySampleProject;

import java.time.LocalDate;

class Employee {
    private String name;
    private int id;
    private LocalDate dob;
	
	static int count = 0;
	
	// Static initializer
	static {
		System.out.println("Employee class loaded");
	}

    public Employee(String name, int id, LocalDate dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
		count++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                '}';
    }
}
