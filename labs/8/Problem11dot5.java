public class Problem11dot5 {
    public static void main(String[] args) {
        Course course1 = new Course("CMPT220");
        Course course2 = new Course("CMPT230");

        course1.addStudent("Connor");
        course1.addStudent("Steve");
        course1.addStudent("Mike");

        course2.addStudent("Mike");
        course2.addStudent("John");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
    }
}