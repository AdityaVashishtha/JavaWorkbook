public class ExtentionChange {
    public static void main(String[] args) {
        if(args.length ==  1) {
            String originalFileName = args[0];                        
            String newFileName = "";
            int lastIndex = originalFileName.lastIndexOf('.');
            newFileName = originalFileName.substring(0,lastIndex)+".enc";
            System.out.println("NEW FILE NAME: "+ newFileName);
        } else {
            System.out.println("PLEASE PASS ONE PARAM IN CMD LINE");
        }
    }
}