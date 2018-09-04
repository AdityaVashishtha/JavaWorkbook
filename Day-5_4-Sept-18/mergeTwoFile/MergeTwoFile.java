import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class MergeTwoFile {
    public static void main(String[] args) throws Exception {
        if(args.length == 2) {
            File oldFile = new File(args[0]);
            File newFile = new File(args[1]);
            if(oldFile.exists()) {
                if (newFile.exists()) {
                    if (oldFile.isFile() && newFile.isFile()) {
                        int n=5;
                        FileInputStream fis1 = new FileInputStream(oldFile);
                        FileInputStream fis2 = new FileInputStream(newFile);
                        FileOutputStream fos = new FileOutputStream("merged.txt");
                        SequenceInputStream seqInput = new SequenceInputStream(fis1,fis2);
                        while( ( n = seqInput.read() ) >= 0 ) {
                            fos.write(n);
                        }
                        fis1.close();
                        fis2.close();
                        fos.close();
                    } else {
                        System.out.println("Source file is a directory");
                    } 
                } else {
                    System.out.println("other file not Exists");        
                 } 
            } else {
              System.out.println("Source file does not exists");  
            } 
        } else {
            System.out.println("Wrong number of arguments pass 2 params");
        }
    }
}