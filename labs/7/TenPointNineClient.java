public class TenPointNineClient {
    public static void main(String[] args) {
        //create course object
        Course cmpt220 = new Course("cmpt220");

        cmpt220.addStudent("Connor");
        cmpt220.addStudent("Nick");
        cmpt220.addStudent("Joe");

        cmpt220.dropStudent("Nick");

        System.out.println("The names in " +
                cmpt220.getCourseName() +" are :");
        String[] students = cmpt220.getStudents();
        for (int i = 0; i < cmpt220.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
    }
}