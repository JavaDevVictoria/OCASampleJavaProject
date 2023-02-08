package MySampleProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

class TeamManager extends Manager {
	private String teamName;
	
	public TeamManager(String name, int id, LocalDate dob, Employee[] team, String teamName) {
        super(name, id, dob, team);
        this.teamName = teamName;
    }
	
	public String getTeamName() {
        return teamName;
    }
	
	void manage() {
		System.out.println(getName() + " is managing the team named " + getTeamName());
	}
	
	@Override
    public String toString() {
        return "TeamManager{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", dob=" + getDob().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", teamName='" + teamName + '\'' +
                ", team=" + Arrays.toString(getTeam()) +
                '}';
    }	
}
