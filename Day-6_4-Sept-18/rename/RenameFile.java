import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        if(args.length == 2) {
            File oldFile = new File(args[0]);
            File newFile = new File(args[1]);
            if(oldFile.exists()) {
                if (!newFile.exists()) {
                    if (oldFile.isFile() && oldFile.length() <= 500 ) {
                        oldFile.renameTo(newFile);
                    } else {
                        System.out.println("Source file is a directory OR size is greater than 500 byte");
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