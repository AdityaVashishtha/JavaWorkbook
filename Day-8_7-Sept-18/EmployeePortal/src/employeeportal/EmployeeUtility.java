package employeeportal;

import java.util.HashSet;

public class EmployeeUtility {
    HashSet<Employee> hashSet;

    public EmployeeUtility() {
        hashSet = new HashSet<>();
    }
    
    
    
    public void addEmployee(Employee e) {
        hashSet.add(e);
    }
    
    public void removeEmployee(int eno) {
        for (Employee employee : hashSet) {
            if(employee.getEmployeeNumber() == eno) {
                hashSet.remove(employee);
                break;
            }
        }
    }
    
    public void viewPermanentEmployee() {
        for (Employee employee : hashSet) {
            if(employee.getType().toLowerCase().equals("permanent")) {
                System.out.println(employee);
            }
        }
    }
    
    public void viewTemporaryEmployee() {
        for (Employee employee : hashSet) {
            if(employee.getType().toLowerCase().equals("temporary")) {
                System.out.println(employee);
            }
        }
    }
    
    public void promoteEmployee(int eno) {
        for (Employee employee : hashSet) {
            if(employee.getEmployeeNumber() == eno) {
                hashSet.remove(employee);
                employee.setType("permanent");
                hashSet.add(employee);
                break;
            }
        }
        
        
    }
    
    
    public void displayEmployees() {
        for (Employee employee : hashSet) {
            System.out.println(employee);
        }
    }
        
}
