import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class CompareTriplets {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int totalA = 0, totalB = 0;

        if(a.get(0) > b.get(0)){
            totalA += 1;
        }
        else if(b.get(0) > a.get(0)){
            totalB += 1;
        }

        if(a.get(1) > b.get(1)){
            totalA += 1;
        }
        else if(b.get(1) > a.get(1)){
            totalB += 1;
        }

        if(a.get(2) > b.get(2)){
            totalA += 1;
        }
        else if(b.get(2) > a.get(2)){
            totalB += 1;
        }

        List<Integer> result = new ArrayList<Integer>();
        result.add(totalA);
        result.add(totalB);

        return result;


    }

}

