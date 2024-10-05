import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {

        HashMap<Integer, Integer> valuesAndCounts = new HashMap<Integer, Integer>();

        for(int i = 0; i < a.size(); i++){
            int number = a.get(i);

            //Initializing the key
            if(!valuesAndCounts.containsKey(number)){
                valuesAndCounts.put(a.get(i), 1);
            }

            //Increasing the value
            else {
                valuesAndCounts.put(number, valuesAndCounts.get(number) + 1);
            }
        }

        //Find which one occurs only once
        for(int key: valuesAndCounts.keySet()){
            if(valuesAndCounts.get(key) == 1){
                return key;
            }
        }

        return -1;
    }
}


class LonelyIntegerSolution{

    public static void main(String[] args){

        List<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(2);
        a.add(5);
        a.add(6);
        a.add(5);
        a.add(6);
        a.add(3);
        a.add(8);
        a.add(8);

        System.out.println(LonelyInteger.lonelyinteger(a));

    }

}
