package week4_interviewTasks;

import java.util.*;

public class StringSameLetters {

    public static void main(String[] args) {
        System.out.println(stringSameLetters("munire", "iremun"));
    }


    public static boolean stringSameLetters(String first,String second){

        String[] firstArray = first.split("");
        String[] secondArray = second.split("");

       Set<String> set1 = new TreeSet<>(Arrays.asList(firstArray));
       Set<String> set2 = new TreeSet<>(Arrays.asList(secondArray));

       boolean value= set1.equals(set2);

        return value;
    }




}
/*
String
Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex:
same(" abc ",","cab"); --> true
same("
abc abb "); -->
 */