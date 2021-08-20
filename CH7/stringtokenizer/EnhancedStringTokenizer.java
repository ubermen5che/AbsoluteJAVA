package CH7.stringtokenizer;

import java.util.StringTokenizer;

public class EnhancedStringTokenizer extends StringTokenizer {

    private String[] tokenBuffer;
    private int count;

    public EnhancedStringTokenizer(String theString){
        super(theString);
        tokenBuffer = new String[countTokens()];
        count = 0;
    }

    public EnhancedStringTokenizer(String theString, String delimiters){
        super(theString, delimiters);
        tokenBuffer = new String[countTokens()];
        count = 0;
    }

    public String nextToken(){
        String token = super.nextToken();
        tokenBuffer[count] = token;
        count++;
        return token;
    }

    public String nextToken(String delimiters){
        String token = super.nextToken(delimiters);
        tokenBuffer[count] = token;
        count++;
        return token;
    }

    public String[] tokensSoFar(){
        String[] arrayToReturn = new String[count];
        for (int i = 0; i < count; i++)
            arrayToReturn[i] = tokenBuffer[i];
        return arrayToReturn;
    }
}
