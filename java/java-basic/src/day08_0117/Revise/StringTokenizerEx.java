package day08_0117.Revise;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {

        String str = "Welcome to java programming";

        StringTokenizer token = new StringTokenizer(str);

        System.out.println("Total number of tokens: " + token.countTokens());

        while(token.hasMoreTokens()){ // If there are more tokens , (till the end of the string)
            System.out.println(token.nextToken()); // print the token to the next line
        }
    }
}
