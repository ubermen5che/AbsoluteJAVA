package CH7.stringtokenizer;

import java.util.Scanner;

public class EnhancedStringTokenizerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        
        EnhancedStringTokenizer wordFactory = new EnhancedStringTokenizer(sentence);
        
        while(wordFactory.hasMoreElements()){
            System.out.println(wordFactory.nextToken() + " ");
        }
        
        String[] tokens = wordFactory.tokensSoFar();
        for (int i = 0; i < tokens.length; i++)
            System.out.println(tokens[i]);
    }
}
