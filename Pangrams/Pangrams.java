import java.util.HashSet;
import java.util.Set;

public class Pangrams{

public static String pangrams(String s) {
    String input = s.toLowerCase();
    Set<Character> alphabetSet = new HashSet<>();
    for(char c = 'a'; c <= 'z'; c++){
        alphabetSet.add(c);
    }
    for(int i = 0; i < input.length(); i++){

        if(alphabetSet.contains(input.charAt(i))){
            alphabetSet.remove(input.charAt(i));
        }
    }

    if(alphabetSet.size() == 0){
        return "pangram";
    }
    else{
        return "not pangram";
    }

}

}

class PangramsSolution{
    public static void main(String[] args) {
        System.out.println(Pangrams.pangrams("We promptly judged antique ivory buckles for the next prize"));
        System.out.println(Pangrams.pangrams("We promptly judged antique ivory buckles for the prize"));
    }
}