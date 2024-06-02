package day6;


import java.util.Random;

public class Task_6_3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иван","Математика");
        Student student = new Student("Вася");
        teacher.evaluate(student);

    }
}


 class Student {
    String name;

    Student(String studentName){
        this.name=studentName;
    }

    public String getStudentName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Teacher{
    private String name;
    private String schoolSubject;

    Teacher(String teacerName, String teacherSchoolSubject){
        this.name=teacerName;
        this.schoolSubject=teacherSchoolSubject;
    }

    public String getSchoolSubject() {
        return schoolSubject;
    }

    public void setSchoolSubject(String schoolSubject) {
        this.schoolSubject = schoolSubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void evaluate(Student student){
        Random random = new Random();
        int grade = random.nextInt((5)+2);
        if (grade==2){
            System.out.println("Преподаватель "+ getName()+" оценил студента с именем "+student.getStudentName()+" по предмету "+getSchoolSubject()+" на оценку 'неудовлетворительно'");
        } else if (grade==3){
            System.out.println("Преподаватель "+ getName()+" оценил студента с именем "+student.getStudentName()+" по предмету "+getSchoolSubject()+" на оценку 'удовлетворительно'");

        } else if (grade==4){
            System.out.println("Преподаватель "+ getName()+" оценил студента с именем "+student.getStudentName()+" по предмету "+getSchoolSubject()+" на оценку 'хорошо'");

        }else {
            System.out.println("Преподаватель "+ getName()+" оценил студента с именем "+student.getStudentName()+" по предмету "+getSchoolSubject()+" на оценку 'отлично'");

        }

    }
}

