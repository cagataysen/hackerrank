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

class PlusMinusB {

        public static void plusMinus(List<Integer> arr) {
            Integer positiveCounter = 0;
            Integer negativeCounter = 0;
            Integer zeroCounter = 0;

            for (int i : arr) {
                if (i > 0) {
                    positiveCounter++;
                } else if (i == 0) {
                    zeroCounter++;

                } else {
                    negativeCounter++;
                }

            }

            ArrayList<Double> ratioList = new ArrayList<Double>(3);
            ratioList.add((double) positiveCounter / arr.size());
            ratioList.add((double) negativeCounter /  arr.size());
            ratioList.add((double) zeroCounter /  arr.size());

            for(Double a: ratioList){
                System.out.println((a));
            }
        }

    }



class SolutionB {
    public static void main(String[] args) throws Exception {

        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        PlusMinusB.plusMinus(arr);

    }
}
