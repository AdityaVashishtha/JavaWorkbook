import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileSplitter {
    public static void main(String[] args) throws Exception {
        if(args.length == 2) {
            String filename = args[0];
            String filePrefix = filename.substring(0,filename.lastIndexOf('.'));            
            File file = new File(args[0]);
            long parts = Long.parseLong(args[1]);
            long fileSize = file.length();            
            long partSize = fileSize/parts;
            long remainSize = fileSize;
            File dir = new File(filePrefix+"-split");
            if(!dir.exists()) {
                dir.mkdir();
            }                
            if(file.exists() && (parts < fileSize) ) {            
                if (file.isFile()) {
                    FileInputStream fis = new FileInputStream(file);                    
                    int i=0;
                    while (parts > 0) {
                        i++;
                        parts--;
                        FileOutputStream fos = new FileOutputStream(filePrefix+"-split/"+filePrefix+"-"+i+".txt");
                        byte b[] = new byte[(int)partSize];
                        fis.read(b);
                        fos.write(b);
                        fos.flush();
                        fos.close();
                        remainSize -= partSize;                        
                    }
                    fis.close();
                } else {
                    System.out.println("Source file is a directory");
                } 
            } else {
                System.out.println("Source file does not exists");  
            }               
        } else {
            System.out.println("Wrong number of arguments pass 2 params");
        }
    }
}