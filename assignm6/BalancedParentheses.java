import java.util.*;

class BalancedParentheses {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        String str1 = "{[()]}";
        String str2 = "{[(])}";
        String str3 = "{{{{";
        
        System.out.println("Is \"" + str1 + "\" balanced? " + isBalanced(str1));
        System.out.println("Is \"" + str2 + "\" balanced? " + isBalanced(str2));
        System.out.println("Is \"" + str3 + "\" balanced? " + isBalanced(str3));
    }
}
