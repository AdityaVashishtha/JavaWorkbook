public class Cities {
    public static void main(String[] args) {
        args = sortCities(args);
        for (String city : args) {
            System.out.println(city);
        }
    }

    public static String[] sortCities(String args[]) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {
                if(args[i].compareTo(args[j]) < 0 ) {
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        return args;
    }
}