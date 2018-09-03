public class AuthClient {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setUsername("india");
        u1.setPassword("indore");
        
        if(u1.verifyUser(args[0],args[1])) {
            System.out.println("WELCOME USER, "+u1.getUsername());
        } else {
            System.out.println("Can't Login");
        }
    }
}