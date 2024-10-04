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

class SparseArrays {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        List<Integer> countList = new ArrayList<Integer>();

        for(int i = 0; i < queries.size(); i++){
            Integer tempCount = 0;
            for(int a = 0; a < strings.size(); a++) {
                if(queries.get(i).equalsIgnoreCase(strings.get(a))) {
                    tempCount++;
                }
            }
            countList.add(tempCount);
        }
        return countList;

    }

}

class SolutionSparseArrays {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<String>();
        List<String> queries = new ArrayList<String>();

        strings.add("abc");
        strings.add("ab");
        strings.add("bc");

        queries.add("abc");
        queries.add("bc");
        queries.add("abc");

        SparseArrays.matchingStrings(strings, queries);


    }
}