package d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.Map.Entry;

public class Teacher extends Employee implements Orders {
	public Teacher(String name, String surname, Integer salary,Rank rank,EducationDegree degree) {
		super(name, surname, salary);
		library = new Vector<Files>();
		rating  = 0;
		this.rank = rank;
		this.degree  =degree;
		courses = new  HashMap<Course, Vector<Student> > ();
		
	}
	private HashMap<Course, Vector<Student> > courses;
	private int rating;
	private Rank rank;
	private EducationDegree degree;
	public Files syllabus = null;
	private Vector<Files> library;	
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	//TEacher ne zakonchil :(
	public  HashMap<Course, Vector<Student> >  getCourses() {
	    return courses;
	}



	public void viewCourses() {
		for (Entry<Course,Vector<Student>> entry : courses.entrySet())
		{
			System.err.println(entry.getKey().getName());
		}
	}
	public Files getSyllabus() {
	   return syllabus;
	}
	public void setSyllabus(Files syllabus) {
		this.syllabus = syllabus;
	}
	public void putMark(Course c,Student s,Integer i) {
		Mark m =s.Courses.get(c);
		if(m.lastPutMark.equals("")) m.setAttestation1(i);
		else if(m.lastPutMark.equals("attestation1")) m.setAttestation2(i);
		else if(m.lastPutMark.equals("attestation2")) m.setFnal(i);
	}

	@Override
	public int compareTo(Object arg0) {
		Teacher t = (Teacher)arg0;
		return salary.compareTo(t.salary);
	}
	
	@Override
	public void sendOrder(Order o) {
		Executor.orders.add(o);
		
	}
	public String toString() {
		return "Teacher:"+super.toString()+
				"\nDegree:"+degree+"\nRank: "+rank+"\nRating: "+rating;
		
	}

}