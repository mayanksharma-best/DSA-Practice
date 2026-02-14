// Program to print all substrings of a given string
import java.util.*;
 class PrintSubstring {
    public static void main(String[] args) {
        String str = "abcd";

        System.out.println( str + " ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}