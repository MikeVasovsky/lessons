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
   private String name;

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
    Random random = new Random();

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
        String a;
        int grade = random.nextInt((4)+2);
        if (grade==2){
            a="Неудовлетворительно";
        } else if (grade==3){
            a="Удовлетворительно";
        } else if (grade==4){
            a="Хорошо";
        }else {
            a="Отлично";
        }
        System.out.println("Преподаватель "+ getName()+" оценил студента с именем "+student.getStudentName()+" по предмету "+getSchoolSubject()+" на оценку "+a);
    }
}

