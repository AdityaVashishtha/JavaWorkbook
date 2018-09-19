public class ReplaceDigit {
    public static void main(String[] args) {
        if(args.length ==  1) {
            String word = args[0];                   
            String newWord = ""     ;
            for (int i = 0; i < word.length(); i++) {
                if( word.charAt(i) >= 48 && word.charAt(i) <= 57 ) {
                    newWord += "#";   
                } else {
                    newWord += word.charAt(i);
                }
            }
            System.out.println("Before Replacement: "+word);
            System.out.println("After Replacement: "+newWord);
        } else {
            System.out.println("PLEASE PASS ONE PARAM IN CMD LINE");
        }
    }
}