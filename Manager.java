package MySampleProject;

import java.time.LocalDate;

abstract class Manager extends Employee {
    protected Employee[] team;

    public Manager(String name, int id, LocalDate dob, Employee[] team) {
        super(name, id, dob);
        this.team = team;
    }

    public Employee[] getTeam() {
        return team;
    }
	
	public void setTeam(Employee[] team) {
        this.team = team;
    }
	
	// Abstract method
	abstract void manage();
}
