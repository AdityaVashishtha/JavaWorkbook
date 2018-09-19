import java.util.StringTokenizer;

public class SeparatesSubjects {
    public static void main(String[] args) {
        if(args.length ==  1) {
            String line = args[0];                        
            StringTokenizer tokens = new StringTokenizer(line,",");
            while (tokens.hasMoreTokens()) {
                String subjectName = tokens.nextToken();
                System.out.println(subjectName.substring(subjectName.lastIndexOf('.')+1));
            }
        } else {
            System.out.println("PLEASE PASS ONE PARAM IN CMD LINE");
        }
    }
}