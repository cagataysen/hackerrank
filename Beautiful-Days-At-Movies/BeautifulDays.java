public class BeautifulDays {
    public static int beautifulDays(int i, int j, int k) {

        int count = 0;

        for(int x = i; x <= j; x++){

            int xReversed = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());

            if(Math.abs(x - xReversed) % k == 0){
                count++;
            }

        }

        return count;

    }
}
