//Course class partially from text, clear method created

public class Course {
    private String courseName;
    private String[] students = new String[1];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        //at a point where the number of students exceeds students.length, add to the students length
        if (numberOfStudents == students.length) {
            String[] a = new String[students.length + 1];
            for (int i = 0; i < numberOfStudents; i++) {
                a[i] = students[i];
            }
            students = a;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    //drop student method
    public void dropStudent(String student) {
        int index = getIndex(student);
        // make sure student index is valid (postive)
        if (index >= 0) {
            dropStudent(index);
        }
    }

    private void dropStudent(int index) {
        String[] s = new String[students.length - 1];
        for (int i = 0, j = 0; i < s.length; i++, j++) {
            if (i == index) {
                j++;
            }
            s[i] = students[j];
        }
        this.students = s;
        numberOfStudents--;
    }

    public void clear() {
        students = new String[1];
        numberOfStudents = 0;
    }

    private int getIndex(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }
}