public class StudentClient {
    public static void main(String args[]) {
        Student s1=new Student();
        s1.setName("ABHINAV");
        s1.setRno(1500);
        s1.setSubjects(50,65,80);        
        Student s2 = new Student(1501,"SURAJ",50,25,60);
        Student s3 = new Student(1502,"ASHISH",20,60,70);
        s2.setSubjects(81,50,52);
        
        //print report
        s1.printReportCard();
        s2.printReportCard();
        s3.printReportCard();

        // Average Calculator
        System.out.println("Average of Students");        
        Student.caculateAverage(s1,s2,s3);        
        
        // To Get overall pass fail
        Student.getCompleteReport();
    }
}