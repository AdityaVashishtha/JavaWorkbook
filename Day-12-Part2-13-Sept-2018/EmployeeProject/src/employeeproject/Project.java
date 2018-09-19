package employeeproject;

public class Project {
    private int pcode;
    private String ptitle;
    private int ccode;

    public Project() {
    }

    public Project(int pcode, String ptitle, int ccode) {
        this.pcode = pcode;
        this.ptitle = ptitle;
        this.ccode = ccode;
    }

    public int getPcode() {
        return pcode;
    }

    public String getPtitle() {
        return ptitle;
    }

    public int getCcode() {
        return ccode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public void setCcode(int ccode) {
        this.ccode = ccode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.pcode;
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
        final Project other = (Project) obj;
        if (this.pcode != other.pcode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Project{" + "pcode=" + pcode + ", ptitle=" + ptitle + ", ccode=" + ccode + '}';
    }
    
}
