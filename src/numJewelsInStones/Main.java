package numJewelsInStones;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String
                J = "aA",
                S = "aAAbbbb";
        int count = numJewelsInStones(J, S);
        System.out.println(count);
    }
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> set = new HashSet<>(J.length()*2);
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for(int i = 0 ; i < S.length();i++){
            if(set.contains(S.charAt(i))){
                count++;
            }
        }
        return count;

    }
}
