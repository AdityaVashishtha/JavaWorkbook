/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcollection;

import java.util.Objects;

/**
 *
 * @author hp
 */
public class Student implements Comparable<Student>{
    private int rollNumber;
    private String name;
    private String branch;
    private int sem;
    private int marks;

    public Student(int rollNumber, String name, String branch, int sem, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public int getSem() {
        return sem;
    }

    public int getMarks() {
        return marks;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return (                    
                    "\n" + rollNumber +
                    "\t" + name + 
                    "\t" + branch +
                    "\t" + sem +
                    "\t" + marks +
                    "\n"
               );
    }
    
    public Student() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.rollNumber != other.rollNumber) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.branch, other.branch)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Student s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // Sorting with marks
        if(this.marks > s.marks) {
            return -1;
        } else if(this.marks < s.marks) {
            return 1;                    
        } else {
            if(this.rollNumber > s.rollNumber) {
                return -1;
            } else if(this.rollNumber < s.rollNumber) {
                return 1;                    
            } else {
                return 0;
            }
        }        
    }
    
}
