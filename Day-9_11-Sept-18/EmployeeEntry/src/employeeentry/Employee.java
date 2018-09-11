package employeeentry;


public class Employee {
    private int empno;
    private String ename;
    private int sal;

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSal(int sal) {
        this.sal = sal;
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

    public Employee(int empno, String ename, int sal) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
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
