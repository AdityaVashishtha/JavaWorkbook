package studentcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class StudentCollection {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Student students[] = new Student[10];
        students[0] = new Student(1, "Abhinav", "CS", 5, 500);
        students[1] = new Student(2, "Abhishek", "IT", 5, 400);
        students[2] = new Student(3, "Suraj", "IT", 5, 300);
        students[3] = new Student(4, "Srajan", "IT", 5, 250);
        students[4] = new Student(5, "Aastha", "IT", 5, 460);
        students[5] = new Student(6, "Nidhi", "CS", 5, 410);
        students[6] = new Student(7, "Ankita", "CS", 5, 400);
        students[7] = new Student(8, "Ashish", "IT", 5, 390);
        students[8] = new Student(9, "Aditya", "CS", 5, 450);
        students[9] = new Student(10, "Ameya", "CS", 5, 350);        
                
        ArrayList<Student> studentList = new ArrayList<Student>();
        
        for (Student student : students) {
            studentList.add(student);
        }
        System.out.println(studentList);
        
        HashMap<String, ArrayList> studentMap = new HashMap<>();
        
        ArrayList<Student> csStudents = new ArrayList<>();
        ArrayList<Student> itStudents = new ArrayList<>();
        
        for (Student student : studentList) {
            if(student.getBranch().equalsIgnoreCase("CS")) {
                csStudents.add(student);
                
            } else if(student.getBranch().equalsIgnoreCase("IT")) {
                itStudents.add(student);                
            }
        }
        
        int choice;
        ArrayList<Student> tempStudent;
        studentMap.put("CS", csStudents);
        studentMap.put("IT", itStudents);
        System.out.println("Enter Choice 1.CS 2.IT");
        choice = scan.nextInt();
        switch(choice) {
            case 1: 
                tempStudent = (ArrayList)studentMap.get("CS");
                for(Student student:  tempStudent) {
                    System.out.print(student);
                }
                break;
            case 2: 
                tempStudent = (ArrayList)studentMap.get("IT");
                for(Student student: tempStudent) {
                    System.out.print(student);                    
                }
                break;
            default: 
                System.out.println("Wrong choice");
                break;
        }
        
        
        Collections.sort(studentList);
        System.out.println("NATURAL SORT WITH MARKS");
        System.out.println(studentList);
        
        Collections.sort(studentList, new Comparator<Student> () {
            @Override
            public int compare(Student o1, Student o2) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return o1.getName().compareTo(o2.getName());
            }
        });        
        System.out.println("SORT WITH NAME");
        System.out.println(studentList);
        
        
        
    }
    
}
