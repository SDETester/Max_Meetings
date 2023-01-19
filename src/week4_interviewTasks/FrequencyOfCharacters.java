package week4_interviewTasks;

import java.util.*;

public class FrequencyOfCharacters {

    // "AABBBCCDDD"  ---> "A2B3C2D3"

    public static void main(String[] args) {


        System.out.println(frequencyOfCharacters("AABBBCCDDD"));

    }

    public static String frequencyOfCharacters(String str){

        String result = "";

        String[] newArray = str.split("");
        ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList(newArray));

        for (String each : newArrayList) {
            int frequency = Collections.frequency(newArrayList, each);
            if (!result.contains(each)) {
                result += each;
                result += frequency;
            }
        }
         return result;
        }









}
