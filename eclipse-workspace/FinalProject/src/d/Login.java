package d;

import java.io.IOException;
import java.util.Scanner;
import java.util.Map.Entry;

public class Login implements viewGenerealInfo {

static String semester = "Fall";
 User user;

 boolean isUser;



public void continueAsGuest() {
}

public void viewFaculties() {
	System.out.println("Below is the list of University faculties");
	for(Faculty f:Admin.allFaculties)
		System.out.println(f);
}


@Override
public void viewTeachersOfTheFaculty(Faculty f) {
	for(Teacher t: f.teachers) {
		System.out.println(t);
	}
}

@Override
public void viewLibrary() {
	System.out.println("University library contains"+Admin.allTextbooks.size()+" books");
	for(Textbook t:Admin.allTextbooks)
		System.out.println(t);
	
}

@Override
public void viewCoursesOfTheFaculty(Faculty f) {
	System.out.println("Teachers of the "+f.getName()+":");
	for(Course c: Admin.allCourses)
		System.out.println(c);
	
}
public static void main(String[] args) throws ClassNotFoundException, IOException {
Scanner sc = new Scanner(System.in);
String log = sc.next();
String pass = sc.next();
	Admin.addUserPassword(log, pass);
	Admin.serializePasswords();
	Admin.deserializePasswords();
	for (Entry<String, String> entry : Admin.allPasswords.entrySet()) {
		System.out.println(entry.getKey()+ ":"+entry.getValue());
	}
}
}

