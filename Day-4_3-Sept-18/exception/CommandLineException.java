public class CommandLineException {
    public static void main(String[] args) {
        try {
            String param1 = args[0];
            String param2 = args[1];            
            System.out.println("Thanks for passing parameters as: ");
            System.out.println(param1);
            System.out.println(param2);    
        } catch (ArrayIndexOutOfBoundsException e) {
            if(e.getMessage().toString().equals("0") ) {
                System.out.println("Please pass two parameters");
            } else if (e.getMessage().toString().equals("1") ) {
                System.out.println("Please pass second parameter");
            } 
        } catch (Exception e) {
            System.out.println("SOME Unknown Error");
        }
    }
}