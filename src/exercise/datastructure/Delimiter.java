package exercise.datastructure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Delimiter {
    public static void main(String[] args){
        String line = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = line.split("\\.");
        String joined = String.join(".",words);
        String newLine = Arrays.toString(words);
        System.out.println(joined);
        System.out.println( newLine);
    }
}
