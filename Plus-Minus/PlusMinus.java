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

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int sizeOfArray = arr.size();
        int positiveAmount = 0;
        int negativeAmount = 0;
        int zeroAmount = 0;

        List<Double> result = new ArrayList<Double>();

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == 0){
                zeroAmount += 1;
            }
            else if(arr.get(i) > 0){
                positiveAmount+= 1;
            }
            else{
                negativeAmount+= 1;
            }
        }
        double division1 = (double) positiveAmount / sizeOfArray;
        double division2 = (double) negativeAmount / sizeOfArray;
        double division3 = (double) zeroAmount / sizeOfArray;

        result.add(division1);
        result.add(division2);
        result.add(division3);

        for(double ratio: result){
            System.out.println(ratio);
        }




    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
