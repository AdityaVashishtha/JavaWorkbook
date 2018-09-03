public class Occurrence {
    public static void main(String[] args) {
        String sentence = "Some sentence containing some words that is something.";
        String word = "some";
        findAllOccurrence(sentence,word);
    }

    public static void findAllOccurrence(String sentence, String word) {
        int i=0;
        int count=0;
        while(sentence.indexOf(word,i) >=0 ) {
            i = sentence.indexOf(word,i);
            System.out.println("Word found at : "+i);
            i++;    
            count++;        
        }
        System.out.println("TOTAL WORD COUNT: "+count);
    }
}