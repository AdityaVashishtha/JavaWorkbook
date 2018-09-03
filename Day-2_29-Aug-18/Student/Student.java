public class Student {
    private final static int PASS_MARKS=33;
    private final static int MAX_MARKS=100;
    private int rno;
    private String name;
    private int sub1; //Marks of Subjects
    private int sub2;
    private int sub3;    
    private boolean isFail;
    private boolean isInitialized;
    private static int overAllPass;
    private static int overAllFail;

    /**
     * Constructors
     */
    public Student() {
        //Default constructor
    }

    public Student(int rno,String name) {
        this.rno=rno;
        this.name=name;
    }

    public Student(int rno,String name, int sub1,int sub2,int sub3) {
        this(rno,name);
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.isInitialized=true;
        if(
            sub1 < PASS_MARKS ||
            sub2 < PASS_MARKS ||
            sub3 < PASS_MARKS
        ) {
            this.isFail=true;
            overAllFail++;
        } else {
            this.isFail=false;
            overAllPass++;
        }
    }

    /**
     * Setter methods 
     */
    public void setRno(int rno) {
        this.rno=rno;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setSubjects(int sub1,int sub2,int sub3) {
        this.sub1=sub1;            
        this.sub2=sub2;
        this.sub3=sub3;
        if(
            sub1 < PASS_MARKS ||
            sub2 < PASS_MARKS ||
            sub3 < PASS_MARKS
        ) {
            if(this.isFail && this.isInitialized) {                                                
                this.isFail=true;
            } else if(!this.isFail && this.isInitialized) {
                overAllFail++; 
                overAllPass--;               
                this.isFail=true;                
            } else {
                overAllFail++;                 
                this.isFail=true;                
            }            
        } else {
            if(this.isFail && this.isInitialized) {
                this.isFail=false;
                overAllPass++;                
                overAllFail--;
            } else if(!this.isFail && this.isInitialized) {                
                this.isFail=false;
            } else {
                overAllPass++;
                this.isFail=false;                
            }           
        }
    }    


    /**
     * Getter methods
     */
    public int getRno() {
        return this.rno;
    }
    public String getName() {
        return this.name;
    }
    public int getSub1() {
        return this.sub1;
    }
    public int getSub2() {
        return this.sub2;
    }
    public int getSub3() {
        return this.sub3;
    }

    /**
     * printReportCard method
     */
    public void printReportCard() {
        System.out.println(
            " Roll No: "+this.rno+
            " Name: "+this.name+
            " Subject 1: "+this.sub1+
            " Subject 2: "+this.sub2+
            " Subject 3: "+this.sub3
        );
    }

    public static void getCompleteReport() {               
        System.out.println(
            "\n---------------------"+
            "\nComplete Report "+
            "\n---------------------"+
            "\n Pass: "+ overAllPass +
            "\n Fail: "+ overAllFail+
            "\n Total: "+ 
            (overAllPass+overAllFail)
        );
    }

    public static void caculateAverage(Student...s) {
        int sum=0;
        int num=0;
        int avg=0;
        for (Student student : s) {
            sum += (student.sub1 + student.sub2 +student.sub3);
            avg = sum/3;
            System.out.println(
                "Student : "+student.rno+
                " "+student.name+
                " Avg Marks: "+avg
            );
            avg=0;
            sum=0;
        }
    }
}