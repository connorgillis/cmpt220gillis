//framework from text (Listing 10.6)

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<String> students;

    //construct Course obj
    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<String>();
    }

    //add students.add
    public void addStudent(String student) {
        students.add(student);
    }

    //getter return studetns.toArray(a)
    public String[] getStudents() {
        String[] a = new String[students.size()];
        return students.toArray(a);
    }

    //getter return students.size()
    public int getNumberOfStudents() {
        return students.size();
    }

    //getter return courseName
    public String getCourseName() {
        return courseName;
    }

    //remove students.remove
    public void dropStudent(String student) {
        students.remove(student);
    }
}