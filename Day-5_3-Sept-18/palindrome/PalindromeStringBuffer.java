public class PalindromeStringBuffer {
    public static void main(String[] args) {
        if(args.length ==  1) {
            StringBuffer word = new StringBuffer(args[0]);
            StringBuffer reverseWord = new StringBuffer(args[0]);
            reverseWord.reverse();
            boolean isPelindrome = word.toString().equals(reverseWord.toString());                        
            if(isPelindrome) {
                System.out.println(word+" IS A PALINDROME USING__STRING BUFFER");
            } else {
                System.out.println(word+" IS NOT A PALINDROME USING__STRING BUFFER");
            }
        } else {
            System.out.println("PLEASE PASS ONE PARAM IN CMD LINE");
        }
    }
}