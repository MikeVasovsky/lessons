package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Вася","А21");
        Teacher teacher = new Teacher("Ваня", "Биология");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();


    }
}
