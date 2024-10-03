import java.io.*;
import java.util.*;


class MiniMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long totalSum = 0;
        int biggestNumber = Integer.MIN_VALUE;
        int lowestNumber = Integer.MAX_VALUE;

        for (Integer i : arr) {
            totalSum += i;
            if (i > biggestNumber) {
                biggestNumber = i;
            }
            if (i < lowestNumber) {
                lowestNumber = i;
            }
        }

        long lowestSum = totalSum - biggestNumber;
        long highestSum = totalSum - lowestNumber;

        System.out.println(lowestSum + " " + highestSum);


    }

}

class SolutionMiniMaxSum {
    public static void main(String[] args) throws IOException {
        List<Integer> exampleList = new ArrayList<Integer>();
        exampleList.add(1);
        exampleList.add(3);
        exampleList.add(5);
        exampleList.add(7);
        exampleList.add(9);
        MiniMaxSum.miniMaxSum(exampleList);
    }
}
