import java.lang.*;
import java.util.HashMap<Course, Vector<Student>;
import java.util.ArrayList<File>;
import java.util.ArrayList<Textbook>;
import java.util.ArrayList<Teacher>;
import java.util.ArrayList<Executor>;
import java.util.ArrayList<Course>;
import java.util.HashMap<Course,Mark>;
import java.util.ArrayList<Student>;
import java.util.ArrayList<AcademicReport>;
import java.util.ArrayList<Order>;
import java.util.HashMap<User,String>;
import java.util.ArrayList<Manager>;

	public class Course implements Comparable, Cloneable, Serializable {
		
		ArrayList<File> files = new ArrayList<File>;
		ArrayList<Textbook> textbooks = new ArrayList<Textbook>;
		ArrayList<Student> students = new ArrayList<Student>;
		private int credits;
		private Faculty faculty;
		private String name;
		private Teacher teacher;
		
		public Course() {
			name = "no name yet";
			faculty = "no faculty yet";
			teacher = "no teacher yet";
			credits = 0;
		}

		public Course(String name, Faculty faculty, Teacher teacher, int credits) {
			this.name = name;
			this.faculty = faculty;
			this.teacher = teacher;
			this.credits = credits;
		}

		public int getCredits() {
			return credits;
		}

		public void setCredits(int credits) {
			this.credits = credits;
		}

		public Faculty getFaculty() {
			return faculty;
		}
		
		public void setFaculty(Faculty faculty) {
			this.faculty = faculty;
		}
		
		public String toString() {
			return "Course name: "+ name + "\nTeacher: " + teacher + "\nCredits: " + credits ;
		}

		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (this == null)
				return false;
			if (!(o instanceof Course))
				return false;
			Course c = (Course) o;
			return (name.equals(c.name) && (faculty.equals(c.faculty) && (teacher.equals(c.teacher) && (credits == c.credits))));
		}

		public ArrayList<Student> getStudents(String id) {
			for (int i=0; i < students.size(); i++) {
				System.out.print(students.get(i));
			}
		}

		public void addStudent(Student s) {
			students.add(s);
		}
		
		public void addFile(Textbook textbook) {
			textbooks.add(textbook);
		}
}


