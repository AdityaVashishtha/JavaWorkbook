package employeeportal;

public class Employee {
    private int employeeNumber;
    private String name;
    private String type;
    private int salary;

    @Override
    public String toString() {
        return "Employee{" + "employeeNumber=" + employeeNumber + ", name=" + name + ", type=" + type + ", salary=" + salary + '}';
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.employeeNumber;
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
        final Employee other = (Employee) obj;
        if (this.employeeNumber != other.employeeNumber) {
            return false;
        }
        return true;
    }
    
    
}
