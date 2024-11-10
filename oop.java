
import java.util.ArrayList;

public class oop {
    public static void main(String[] args) {

        Student s = new Student();
        s.set_name("Student");
        Teacher T = new Teacher();
        T.set_name("Teacher");

        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(T);

        for (User a : User.admins) {
            a.verify();
        }
    } 
}
