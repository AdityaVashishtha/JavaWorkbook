public class Palindrome {
    public static void main(String[] args) {
        if(args.length ==  1) {
            String word = args[0];            
            int wordLen = word.length();
            boolean isPelindrome = true;
            for (int i = 0; i < wordLen; i++) {
                if( word.charAt(i) != word.charAt(wordLen-i-1) ) {
                    isPelindrome = false;
                    System.out.println(word+" IS NOT PALINDROME WORD");
                    break;
                }
            } 
            if(isPelindrome) {
                System.out.println(word+" IS A PALINDROME WORD");
            }
        } else {
            System.out.println("PLEASE PASS ONE PARAM IN CMD LINE");
        }
    }
}