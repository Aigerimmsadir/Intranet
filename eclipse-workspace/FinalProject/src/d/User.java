package d;

import java.io.Serializable;
import java.util.Vector;

public abstract class User implements Cloneable, Comparable, Serializable {

	 String name;
	 String surname;
	 String login;
    String password = name.toCharArray()[0]+""+surname.toCharArray()[0];
  
   
     public User(String name,String surname) {
    	 this.name = name;
    	 this.surname = surname;
     }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    @Override
    public String toString() {
        return name+" "+surname;
    }

    public void writeComments(Announcement a,String comment) {
    	a.comments.add(comment);
    }
}
