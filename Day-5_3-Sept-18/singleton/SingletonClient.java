public class SingletonClient {
    public static void main(String[] args) {
        Singleton s1,s2;
        /**
         * This will not work
         * s1 = new Singleton();
        */
        s1 = Singleton.getSingleton(20);
        System.out.println(s1.getData());
        s1.setData(53);
        System.out.println(s1.getData());
        s2 = Singleton.getSingleton(20);
        System.out.println(s2.getData());
    }
}