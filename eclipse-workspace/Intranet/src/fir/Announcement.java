import java.lang.*;
import java.util.*;
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

public class Announcement implements Comparable, Serializable {
	private String title;
	private String author;
	private Date date;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor (String author) {
		this.author = author;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public int compareTo(Object o) {
		return 0;
	}

}

