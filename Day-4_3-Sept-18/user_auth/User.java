public class User {
    String username;
    String password;

    public User() {
        //Default constructor
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }    

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String  getPassword() {
        return this.password;
    }

    public boolean verifyUser(String username, String password) {
        if(this.username.toLowerCase().equals(username.toLowerCase())) {            
            if(this.password.equals(password)) {
                return true;
            } else {
                System.out.println("INVALID PASSWORD");
                return false;
            }            
        } else {
            System.out.println("INVALID USERNAME");
            return false;
        }
    }
}