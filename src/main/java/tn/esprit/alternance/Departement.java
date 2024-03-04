package tn.esprit.alternance;

import java.util.List;

public class Departement {
	private String name;
    private String description;
    private List<Employe> employees;
    
	public Departement(String name, String description, List<Employe> employees) {
		super();
		this.name = name;
		this.description = description;
		this.employees = employees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Employe> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employe> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Departement [name=" + name + ", description=" + description + ", employees=" + employees + "]";
	}
    
}
