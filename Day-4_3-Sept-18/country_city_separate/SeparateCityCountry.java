import java.util.StringTokenizer;

public class SeparateCityCountry {
    public static void main(String[] args) {
        if(args.length ==  1) {
            String line = args[0];                        
            String cities = "";
            String countries = "";
            StringTokenizer tokens = new StringTokenizer(line,"-");
            cities = tokens.nextToken();
            countries = tokens.nextToken();
            StringTokenizer cityTokens = new StringTokenizer(cities,",");
            StringTokenizer countriesTokens = new StringTokenizer(countries,",");
            System.out.println("CITIES");
            while (cityTokens.hasMoreTokens()) {
                System.out.println(cityTokens.nextToken());
            }
            System.out.println("COUNTRIES");
            while (countriesTokens.hasMoreTokens()) {
                System.out.println(countriesTokens.nextToken());
            }
        } else {
            System.out.println("PLEASE PASS ONE PARAM IN CMD LINE");
        }
    }
}