package removeOuterParentheses;

public class Main {
    public static void main(String[] args) {
        String s = "(()())(())";
        String result = removeOuterParentheses(s);
        System.out.println(result);
    }

    public static String removeOuterParentheses(String S) {
        int left = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(' && left++ > 0) {
                res.append('(');
            }
            if (S.charAt(i) == ')' && --left > 0) {
                res.append(')');
            }

        }
        return res.toString();
    }
}