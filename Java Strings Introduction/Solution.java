import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        System.out.println(sum);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String s1 = A.substring(0, 1).toUpperCase();
        String s2 = A.substring(1);
        String output1 = s1 + s2;

        String s3 = B.substring(0, 1).toUpperCase();
        String s4 = B.substring(1);
        String output2 = s3 + s4;

        System.out.println(output1 + " " + output2);
    }
}