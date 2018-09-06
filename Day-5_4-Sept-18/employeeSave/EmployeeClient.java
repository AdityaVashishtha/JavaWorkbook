import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.util.Scanner;

public class EmployeeClient {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        File file = new File("emp.data");
        if(args.length == 1) {
            int choice = Integer.parseInt(args[0]);
            Employee emp = null;
            switch (choice) {
                case 1:
                    System.out.println("Enter Employee Details");
                    System.out.println("Name: ");
                    String name = scan.next();
                    int eno = scan.nextInt();
                    int salary = scan.nextInt();
                    emp = new Employee(name,eno,salary);                    
                    FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(emp);
                    break;
                case 2:                     
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    emp = (Employee) ois.readObject();            
                    emp.displayInfo();
                default:
                    break;
            }            
        } else {
            System.out.println("Please pass choice 1 for new Emp and 2 to view old employee in command line");
        }
    }
}