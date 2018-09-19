import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        if(args.length == 2) {
            File oldFile = new File(args[0]);
            File newFile = new File(args[1]);
            if(oldFile.exists()) {
                if (!newFile.exists()) {
                    if (oldFile.isFile()) {
                        FileInputStream fis = new FileInputStream(oldFile);
                        FileOutputStream fos = new FileOutputStream(newFile);                        
                        int n = 5;
                        while( ( n = fis.read() ) >= 0 ) {
                            fos.write(n);
                        }
                        fis.close();
                        fos.close();
                    } else {
                        System.out.println("Source file is a directory");
                    } 
                } else {
                    System.out.println("New File Already Exists");        
                 } 
            } else {
              System.out.println("Source file does not exists");  
            } 
        } else {
            System.out.println("Wrong number of arguments pass 2 params");
        }
    }
}