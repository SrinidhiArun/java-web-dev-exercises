package exercise.datastructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(14);
        numbers.add(5);
        numbers.add(2);
        System.out.println("sum is "+addEven(numbers));

        //String to Array to ArrayList
        String line = "I would not, could not, in a box . I would not, " +
                "could not with a fox . I will not eat them in a house. I will not eat them with a mouse.";
        String[] stringArray = line.split(" ");
        List<String> list = Arrays.asList(stringArray);

        //Finding word with given length
        System.out.println("Enter the word length to search");
        Scanner input = new Scanner(System.in);
        int wordLength = input.nextInt();
        int numberOfWords = findWordWithLength(list, wordLength);
        System.out.println(numberOfWords);

    }
    static int addEven(ArrayList<Integer> number){
        int sum = 0;
        for(int i: number){
            if(i%2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    static int findWordWithLength(List<String> list, int wordLength){
        int noOfWords = 0;
        for(String word: list){
            if(word.length() == wordLength){
                System.out.println(word);
                noOfWords++;
            }
        }
        return noOfWords;
    }
}
