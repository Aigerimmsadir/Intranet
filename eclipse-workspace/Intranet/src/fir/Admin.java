import java.util.*;
import java.lang.*;
import java.util.ArrayList<Teacher>;
import java.util.ArrayList<Executor>;
import java.util.HashMap<Course,Mark>;
import java.util.ArrayList<Student>;
import java.util.HashMap<User,String>;
import java.util.ArrayList<Manager>;
/**
*/
public class Admin extends Employee implements Orders {
/**
*/
private static HashMap<User,String> allPasswords;
/**
*/
private static ArrayList<Student> allStudents;
/**
*/
private static ArrayList<Manager> allManagers;
/**
*/
private static ArrayList<Teacher> allTeachers;
/**
*/
private static ArrayList<Executor> allExecutors;
/**
*/
private static ArrayList allCourses;
/**
 * @param param2 
 * @param param2 
*/
public void addUserPassword(User param2, String param2) {
}
/**
 * @return 
*/
public HashMap<User,String> getAllPasswords() {
    return null;
}
/**
 * @return 
*/
public ArrayList<Student> getAllStudents() {
    return null;
}
/**
 * @return 
*/
public ArrayList<Manager> getAllManagers() {
    return null;
}
/**
 * @return 
*/
public ArrayList<Teacher> getAllTeachers() {
    return null;
}
/**
 * @return 
*/
public ArrayList<Executor> getAllExecutors() {
    return null;
}
/**
 * @return 
*/
public ArrayList getAllCourses() {
    return null;
}
/**
 * @param param1 
*/
public void addStudent(Student param1) {
}
/**
 * @param param1 
*/
public void addManager(Manager param1) {
}
/**
 * @param param1 
*/
public void addTeacher(Teacher param1) {
}
/**
 * @param param1 
*/
public void addExecutor(Executor param1) {
}
/**
 * @param o 
*/
public void sendOrder(Order o) {
}
}

