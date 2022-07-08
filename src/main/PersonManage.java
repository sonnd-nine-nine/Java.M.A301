package main;

import entities.Person;
import entities.Student;
import entities.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManage {

    static List<Student> studentList = new ArrayList<>();
    static List<Teacher> teacherList = new ArrayList<>();
    static String name, gender, phoneNumber, email;
    static String idStudent;
    static double theory, practice, basicSalary, subsidy;

    static Scanner scanner = new Scanner(System.in);

    /**
     * Enter info 5 Student and 5 Teacher
     * handle with it
     * @param args
     */

    public static void main(String[] args) {
        Init();
        UpdateStudentById();
        DisplayTeacherSalaryHigh();
        DisplayStudentPassCourse();
    }


    private static void DisplayStudentPassCourse() {
        for(Student s: studentList){
            if(s.calculateFinalMark()>6){
                System.out.println(s.toString());
            }
        }
    }

    private static void DisplayTeacherSalaryHigh() {
        for(Teacher t: teacherList){
            if(t.calculateSalary()>1000){
                System.out.println(t.toString());
            }
        }
    }

    private static void UpdateStudentById() {
        String idStudent;
        System.out.print("Enter idStudent: ");
        idStudent = scanner.nextLine();
        for (Student i: studentList){
            if(i.getIdStudent().equals(idStudent)){
                System.out.println("Update student mark!!");
                System.out.print("Theory: ");
                i.setTheory(scanner.nextDouble());
                System.out.print("Practice: ");
                i.setPractice(scanner.nextDouble());
                scanner.nextLine();
            }
        }
    }

    private static void Init() {
        for (int i=0; i<10; i++){
            if(i<5)
                System.out.println("Enter info students...___ ");
            else
                System.out.println("Enter info teachers...___");
            System.out.print("Name: ");
            name = scanner.nextLine();
            System.out.print("Gender: ");
            gender = scanner.nextLine();
            System.out.print("phoneNumber: ");
            phoneNumber = scanner.nextLine();
            System.out.print("Email: ");
            email = scanner.nextLine();
            if(i<5){
                System.out.print("idStudent: ");
                idStudent = scanner.nextLine();
                System.out.print("Theory mark: ");
                theory = scanner.nextDouble();
                System.out.print("Practice mark: ");
                practice= scanner.nextDouble();
                scanner.nextLine();
                Student s = new Student(name, gender, phoneNumber, email, idStudent, theory, practice);
                studentList.add(s);
            }
            else {
                System.out.print("Basic Salary: ");
                basicSalary = scanner.nextDouble();
                System.out.print("Subsidy: ");
                subsidy = scanner.nextDouble();
                scanner.nextLine();
                Teacher t = new Teacher(name, gender, phoneNumber, email, basicSalary, subsidy);
                teacherList.add(t);
            }

        }
    }
}
