package employeeproject;

public class Employee {
    private int empno;
    private String ename;
    private int sal;
    private int pcode;
    Project project;
    Client client;
    
    public Employee(int empno, String ename, int sal, int pcode) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.pcode = pcode;
    }

    public Employee() {
    }

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public int getSal() {
        return sal;
    }

    public int getPcode() {
        return pcode;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    @Override
    public String toString() {
        return "Employee{" + "empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", pcode=" + pcode + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.empno;
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
        if (this.empno != other.empno) {
            return false;
        }
        return true;
    }
    
}
