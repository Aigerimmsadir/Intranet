package d;

import java.util.ArrayList;

public class Specialization implements Comparable {
	private String name;
	private ArrayList<Student> students;
	private Faculty faculty;
	
	public Specialization (String name, Faculty f) {
		this.name = name;
		faculty  =f;
	}
	public String getName() {
	    return this.name;
	}
	public Faculty getFaculty() {
	    return this.faculty;
	}

	public ArrayList<Student> getStudents() {
	    return students;
	}
	public void addStudent(Student s) {
		students.add(s);
	}
	public boolean equals(Object obj) {
		Specialization s = (Specialization) obj;
		if(s.getName().equals(name) && faculty.equals(s.getFaculty())
				&& students.equals(s.getStudents())) return true;
		
			return false;
	}
	public String toString() {
		return "Specialization [name=" + name + ", number of students=" + students.size() + "]";
	}
	
	public int compareTo(Object o) {//по количеству студентов
		Specialization s = (Specialization) o;
		Integer i1 = students.size();
		Integer i2 = s.getStudents().size();
		return i1.compareTo(i2);
	}
}

