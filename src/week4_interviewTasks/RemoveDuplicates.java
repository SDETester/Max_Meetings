package week4_interviewTasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBBCCDDDD"));
    }

    public static String removeDup(String str){

        String result = "";
        String[] strArray = str.split("");
        Set<String> strSet = new LinkedHashSet<>();
        strSet.addAll(Arrays.asList(strArray));

        for (String each : strSet) {
            result += each;
        }
        return result;
    }


}
/*
String
Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex:
removeDup (" AAABBBCCC")==> ABC
 */