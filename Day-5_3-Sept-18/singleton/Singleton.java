public class Singleton {

    private static Singleton obj;
    private int data;

    private Singleton() {

    }   
    private Singleton(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data=data;
    }

    public int getData() {
        return this.data;
    }
    public static Singleton getSingleton(int data) {
        if(obj != null) {
            return obj;
        } else {
            obj = new Singleton(data);
            return obj;
        }        
    }

}