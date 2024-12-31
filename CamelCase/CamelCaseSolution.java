public class CamelCaseSolution {

    public static int camelcase(String s) {
        //ASCII Control may be applicable
        //for loop with char
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            for(char c = 'A'; c <= 'Z'; c++){
                if(s.charAt(i) == c){
                    count++;
                }
            }

        }
        return count;
        
    }

}
