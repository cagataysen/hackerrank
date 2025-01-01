import java.util.ArrayList;
import java.util.List;

/*
 * Complete the 'bonAppetit' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY bill                       List<Integer> bill
 *  2. INTEGER k  -- Anna doesn't eat           bill.get(k)
 *  3. INTEGER b  -- Anna is paying             b
 */


public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int owned = 0;
        int totalSum = 0;
        int AnnaShouldPay = 0;

        if(k != 0){
            List<Integer> newBill = new ArrayList<>();
            for(int i = 0; i < bill.size(); i++) {
                if(i != k){
                    newBill.add(bill.get(i));
                }
            }

            for(int i: newBill){
                totalSum += i;
            }
            AnnaShouldPay = totalSum / 2;
            owned = b - AnnaShouldPay;

        }
        else{
            for(int i: bill){
                totalSum += i;
            }

            AnnaShouldPay = totalSum / 2;
            owned = b - AnnaShouldPay;
        }


        if(owned == 0){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(owned);
        }


    }

}

}
