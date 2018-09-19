import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class MergeFile {
    public static void main(String[] args) throws Exception {
        try {
            Vector<FileInputStream> files = new Vector<>();
            for (String arg : args) {
                File f = new File(arg);         
                FileInputStream fis = new FileInputStream(f);
                files.add(fis);
            }
            int n =5;
            FileOutputStream fos = new FileOutputStream("merged.txt");
            SequenceInputStream seqInput = new SequenceInputStream(files.elements());
            while( ( n = seqInput.read() ) >= 0 ) {
                fos.write(n);
            }
            fos.close();        
            for (FileInputStream file : files) {
                file.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}