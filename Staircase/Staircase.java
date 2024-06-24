import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Staircase {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {

        int elementsPrintingInThatLine = 1;


        for(int i = 1; i <= n; i++) {

            for(int j = 0; j < n - i; j++){
                System.out.print(" ");

            }

            for(int k = 0; k < i; k++){
                System.out.print("#");
            }

            System.out.println();

            elementsPrintingInThatLine++;

        }

    }

}

