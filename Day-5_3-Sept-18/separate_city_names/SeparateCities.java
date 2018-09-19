public class SeparateCities {
    public static void main(String[] args) {
        if(args.length ==  1) {
            int count=0,endPos=0;
            String sentence = args[0];                                                
            for (int i = 0; i < sentence.length(); i++) {                
                if(sentence.charAt(i) == ',' ) {
                    endPos = sentence.indexOf(',',count);
                    System.out.println(sentence.substring(count,endPos));
                    count = endPos+1;
                } 
            }            
            System.out.println(sentence.substring(count));

        } else {
            System.out.println("PLEASE PASS ONE PARAM IN CMD LINE");
        }
    }
}