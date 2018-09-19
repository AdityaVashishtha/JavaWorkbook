public class CountCharacters {
    public static void main(String[] args) {
        int countLCap=0;
        int countUCap=0;
        int countDigit=0;
        if(args.length > 0) {
            char charArr [] = args[0].toCharArray();
            for (char ch : charArr) {
                if( ch >= 65 && ch <= 90 ) {
                    countUCap++;
                } else if( ch >= 97 && ch <= 122 )  {
                    countLCap++;
                } else if( ch >= 48 && ch <= 57 )  {
                    countDigit++;
                } 
            }
            System.out.println("Total Summary of Text");
            System.out.println("Total UpperCase Chars: "+countUCap);
            System.out.println("Total LowerCase Chars: "+countLCap);
            System.out.println("Total Digits: "+countDigit);
        }
    }
}