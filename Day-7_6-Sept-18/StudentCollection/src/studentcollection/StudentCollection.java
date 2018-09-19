package studentcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class StudentCollection {

    public static ArrayList<Student> addStudents() {
        
        ArrayList<Student> studentList = new ArrayList<Student>();       
        
        studentList.add(new Student(1, "Abhinav", "CS", 5, 500));
        studentList.add(new Student(2, "Abhishek", "IT", 5, 400));
        studentList.add(new Student(3, "Suraj", "IT", 5, 300));
        studentList.add(new Student(4, "Srajan", "IT", 5, 250));
        studentList.add(new Student(5, "Aastha", "IT", 5, 460));
        studentList.add(new Student(6, "Nidhi", "CS", 5, 410));
        studentList.add(new Student(7, "Ankita", "CS", 5, 400));
        studentList.add(new Student(8, "Ashish", "IT", 5, 390));
        studentList.add(new Student(9, "Aditya", "CS", 5, 450));
        studentList.add(new Student(10, "Ameya", "CS", 5, 350));
        
        return studentList;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Student> studentList = StudentCollection.addStudents();
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
