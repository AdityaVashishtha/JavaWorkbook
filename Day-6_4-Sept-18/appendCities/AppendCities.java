import java.io.File;
import java.io.FileOutputStream;


public class AppendCities {
    public static void main(String[] args) throws Exception {
        File appendFile = new File("cities.txt");
        if(!appendFile.exists()) {
            appendFile.createNewFile();            
        }
        if(args.length == 1) {
            String cityName = args[0];
            FileOutputStream fos = new FileOutputStream(appendFile,true);
            fos.write(cityName.getBytes());
            fos.write("\n".getBytes());
            fos.close();
        } else {
            System.out.println("Wrong number of parameters");
        }
    }
}