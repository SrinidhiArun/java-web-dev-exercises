package org.launchcode.java.studios.countingcharacters;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacter {
    public static void main(String[] args){
        String line = "If the product of two terms is zero then common sense says at least one of the " +
                "two terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        File file = new File("src/org/launchcode/java/studios/countingcharacters/InputText.txt");

        String content = null;
        try {
            content = readFile(file);
            HashMap<String, Integer> characterCount = getCountOfChar(content);
            printCharacterCount(characterCount);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String readFile(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        InputStream in = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line + System.lineSeparator());
        }

        return sb.toString();
    }
    static HashMap<String, Integer> getCountOfChar(String sentence){
     sentence = sentence.toLowerCase();
     char[] characters = sentence.toCharArray();
     HashMap<String, Integer> countCharacter = new HashMap<>();
     int count;
     for(char letter: characters){
         if(Character.isAlphabetic(letter)) {
             count = 0;
             for (char alphabet : characters) {
                 if (letter == alphabet) {
                     count++;
                 }
             }
             countCharacter.put(Character.toString(letter), count);
         }
     }
     return countCharacter;
    }
    static void printCharacterCount(HashMap<String,Integer> characterCount){
        for(Map.Entry charEntry: characterCount.entrySet()){
            System.out.println(charEntry.getKey()+" : "+charEntry.getValue());
        }
    }
}
