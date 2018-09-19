import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int eno;
    private int salary;

    public Employee() {
        //Default Constructor
    }

    public Employee(String name, int eno, int salary) {
        this.name = name;
        this.eno = eno;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee Info");
        System.out.println("Name: "+this.name);
        System.out.println("Employee Number: "+this.eno);
        System.out.println("Salary: "+this.salary);
    }




    
}