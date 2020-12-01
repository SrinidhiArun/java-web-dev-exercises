package exercise.datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<Integer,String> roster = new HashMap<Integer, String>();
        roster = getStudentDetails();
        diplayStudentDetails(roster);
    }
    static HashMap<Integer,String> getStudentDetails(){
        HashMap<Integer,String> roster = new HashMap<Integer, String>();
        int id;
        String name;
        int noOfStudents;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of students");
        noOfStudents = input.nextInt();
        while(noOfStudents > 0) {
            System.out.println("Enter the ID of student");
            id = input.nextInt();
            System.out.println("Enter student name");
            name = input.next();
            roster.put(id, name);
            noOfStudents--;
        }
        input.close();
        return  roster;
    }

    static void diplayStudentDetails(HashMap<Integer,String> roster){
        for(Map.Entry student: roster.entrySet()){
            System.out.println("The ID of student "+ student.getValue()+" is "+student.getKey());
        }
    }
}
