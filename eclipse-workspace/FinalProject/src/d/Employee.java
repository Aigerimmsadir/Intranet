package d;

public abstract class Employee extends User {
	public Employee(String name, String surname,Integer salary) {
		super(name, surname);
		this.salary = salary;
		login = name.toCharArray()[0]+"."+surname;
	}

	protected Integer salary;

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}
public String toString() {
    return name+" "+surname;
}
}


