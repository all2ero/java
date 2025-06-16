import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student2 = new Student("2024000345", "한다영", "재학", "2005-04-06", "010-1234-1234");

        student2.addCourse("Java");
        student2.addCourse("Python");

        System.out.println("학생1의 정보");
        student2.printInfo();

        Professor professor = new Professor("005", "하성연", "사퇴", "2005-04-22", "010-1234-1234");
        professor.addLecture("Java");
        professor.addLecture("Application Security");

        System.out.println("교수의 정보");
        professor.printInfo();
    }
}