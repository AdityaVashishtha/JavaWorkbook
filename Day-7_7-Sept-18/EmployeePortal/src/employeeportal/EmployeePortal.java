package employeeportal;

import java.util.Scanner;

public class EmployeePortal {

    public static void main(String[] args) {
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        EmployeeUtility util = new EmployeeUtility();
        while(true) {
            System.out.println("______________________");
            System.out.println("Select from menu");
            System.out.println("1. Add New Emp");
            System.out.println("2. Remove Emp");
            System.out.println("3. View Perm Emp");
            System.out.println("4. View Temp Emp");
            System.out.println("5. Promote Emp");
            System.out.println("6. Display Emp");
            System.out.println("EXIT (0)");
            System.out.println("______________________");
            choice = scan.nextInt();   
            if(choice == 0 )
                break;
            switch(choice) {
                case 1:
                    System.out.println("Enter Following");
                    System.out.println("Employee Number");
                    System.out.println("Employee Name");
                    System.out.println("permanent/temporary");
                    System.out.println("Salary");
                    int eno = scan.nextInt();

                    String ename = scan.next();

                    String type = scan.next();

                    int sal = scan.nextInt();
                    util.addEmployee(new Employee(eno,ename,type,sal));
                    break;
                case 2:
                    System.out.println("Enter employee number to remove");
                    int tmp = scan.nextInt();
                    util.removeEmployee(tmp);
                    break;
                case 3:
                    System.out.println("Permanent Employees::");
                    util.viewPermanentEmployee();
                    break;
                case 4:
                    System.out.println("Temporary Employees::");
                    util.viewTemporaryEmployee();
                    break;
                case 5: 
                    System.out.println("Enter Employee no to promote");
                    int t = scan.nextInt();
                    util.promoteEmployee(t);
                    break;
                case 6: 
                    util.displayEmployees();
                    break;
                default: System.out.println("INVALID OPTION");
                    break;
            }
        }
    }
    
}
