import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MergeFile {
    public static void main(String[] args) throws Exception {
        if(args.length == 1) {
            File dir = new File(args[0]);
            String fileName = args[0].substring(0,args[0].lastIndexOf('-'));
            if(dir.exists() && dir.isDirectory()) {
                int i=1;                
                while(true) {
                    File part = new File(args[0]+"/"+fileName+"-"+i+".txt");                    
                    if(!part.exists()) {
                        break;
                    } else {
                        FileInputStream fis = new FileInputStream(part);
                        FileOutputStream fos = new FileOutputStream(fileName,true);
                        byte b[] = new byte[(int)part.length()];
                        fis.read(b);
                        fos.write(b);
                        fos.flush();
                        fis.close();
                        fos.close();
                    }
                    i++;
                }
            } else {
                System.out.println("Not exists or directory");
            }
        } else {
            System.err.println("Wrong number of parameters one param expected");
        }
    }
}