package d;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Admin extends Employee implements Orders {
public Admin(String name, String surname, Integer salary) {
		super(name, surname, salary);
		
	}

 static HashMap<String,String> allPasswords=new HashMap<String,String>();
 static Vector<Student> allStudents =new Vector<Student>();

 static Vector<Manager> allManagers = new Vector<Manager>();

 static Vector<Teacher> allTeachers = new Vector<Teacher>();

 static Vector<Executor> allExecutors = new Vector<Executor>();
 static Vector<Faculty> allFaculties =new Vector<Faculty>();
 static Vector<Textbook> allTextbooks = new  Vector<Textbook>();
 static Vector<Course> allCourses = new Vector<Course>();
 static Vector<User> allUsers = new  Vector<User>();
 static Vector<Announcement> allAnnouncements =new Vector<Announcement> ();
 
 
 static void initializeObjects() throws ClassNotFoundException, IOException {
	 deserializeUser();
	 deserializePasswords();
	 recognizeUser();
	 deserializeTextbooks();
	 deserializeFaculties();
	 deserializeCourses();
 }
 
 @SuppressWarnings("unchecked")
static void deserializeUser()  throws IOException, ClassNotFoundException{
	FileInputStream fis = new FileInputStream("user.out"); 
	ObjectInputStream oin =new ObjectInputStream(fis); 
	allUsers = ( Vector<User> )	oin.readObject();		
 }
 static void recognizeUser() {
	 for(User u: allUsers) {
		 if(u instanceof Student) allStudents.add((Student)u);
		 else if(u instanceof Teacher) allTeachers.add((Teacher)u);
		 else if(u instanceof Executor) allExecutors.add((Executor)u);
		 else if(u instanceof Manager) allManagers.add((Manager)u);
	 }
 }
 static void serializeUser() throws IOException, ClassNotFoundException{
	 	allUsers.clear();
	 	allUsers.addAll(allStudents);	 
		allUsers.addAll(allTeachers);	
		allUsers.addAll(allManagers);	
		allUsers.addAll(allExecutors);
	 	FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\FinalProject\\bin\\d\\user.out"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(allUsers); 
		oos.flush(); 
		oos.close(); 
 }
 @SuppressWarnings("unchecked")
 	static void deserializePasswords()  throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("passwords.out"); 
		ObjectInputStream oin =new ObjectInputStream(fis); 
		allPasswords = (HashMap<String,String>)	oin.readObject();		
	 }
 static void serializePasswords() throws IOException, ClassNotFoundException{
	 	
	 	FileOutputStream fos = new FileOutputStream("passwords.out"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(allPasswords); 
		oos.flush(); 
		oos.close(); 
}
 static void deserializeTextbooks()  throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("textbooks.out"); 
		ObjectInputStream oin =new ObjectInputStream(fis); 
		allTextbooks = (Vector<Textbook>)	oin.readObject();		
 }
 static void serializeTextbooks() throws IOException, ClassNotFoundException{
	 	
	 	FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\FinalProject\\bin\\d\\textbooks.out"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(allTextbooks); 
		oos.flush(); 
		oos.close(); 
 }
 static void deserializeFaculties()  throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("faculties.out"); 
		ObjectInputStream oin =new ObjectInputStream(fis); 
		allFaculties = (Vector<Faculty>)	oin.readObject();		
}
 static void serializeFaculties() throws IOException, ClassNotFoundException{
	 	FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\FinalProject\\bin\\d\\faculties.out"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(allFaculties); 
		oos.flush(); 
		oos.close(); 
}
 static void deserializeCourses()  throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("courses.out"); 
		ObjectInputStream oin =new ObjectInputStream(fis); 
		allCourses = (Vector<Course>)	oin.readObject();		
}
static void serializeCourses() throws IOException, ClassNotFoundException{
	 	FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\FinalProject\\bin\\d\\courses.out"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(allCourses); 
		oos.flush(); 
		oos.close(); 
}
 static void deserializeAnnouncements()  throws IOException, ClassNotFoundException{
	FileInputStream fis = new FileInputStream("announcements.out"); 
	ObjectInputStream oin =new ObjectInputStream(fis); 
	allAnnouncements= (Vector<Announcement>)	oin.readObject();		
}
 static void serializeAnnouncements() throws IOException, ClassNotFoundException{
 	FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\FinalProject\\bin\\d\\announcements.out"); 
	ObjectOutputStream oos = new ObjectOutputStream(fos); 
	oos.writeObject(allAnnouncements); 
	oos.flush(); 
	oos.close(); 
}
public static void addUserPassword(String login, String pass) {
	allPasswords.put(login, pass);
}

@Override
public int compareTo(Object arg0) {
	Admin a = (Admin)arg0;
	return name.compareTo(a.name);
}

@Override
public void sendOrder(Order o) {
	Executor.orders.add(o);	
}


}
