package exercise.datastructure;

public class OddNumbers {
    public static void main(String[] args){
        int[] numbers = {1, 1, 2, 3, 5, 8};
        for(int i : numbers){
            System.out.println("Numbers: "+ i);
            if(i%2 != 0){
                System.out.println("Odd number: "+ i);
            }
        }

    }
}
