import java.io.File;
import java.io.FileInputStream;

public class PrintNDelete {
    public static void main(String[] args) throws Exception {
        if(args.length == 1) {
            File file = new File(args[0]);
            if(file.exists() && file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                byte b[] = new byte[(int)file.length()];
                fis.read(b);
                System.out.print(new String(b));
                if(file.delete()) {
                    System.out.println("File Successfully deleted");
                } else {
                    System.out.println("File can't be deleted Due to some reason");
                }
            } else {
                System.out.println("File is not exists");
            }
        } else {
            System.out.println("Wrong number of params");
        }
    }
}