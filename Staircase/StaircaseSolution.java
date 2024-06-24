import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StaircaseSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Staircase.staircase(n);

        bufferedReader.close();
    }
}
