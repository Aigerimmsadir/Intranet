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

	public class AcademicReport {
		private String name;
		private String author;
		public String report;

		public AcademicReport() {
			name = "no name";
			author = "no author";
			report = "";
		}
		
		public AcademicReport(String name, String author) {
			this.name = name;
			this.author = author;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void writeReport(String report) {
			this.report = report;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
}

