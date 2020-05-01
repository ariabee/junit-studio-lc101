package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;

        if (str == null) { // DEMO: showing what happens if the method handles null strings (like it should)
            return true;
        }

        for (char ch : str.toCharArray()) {
            if (brackets >= 0) { // Make sure the first bracket is not "]", setting brackets to -1
                if (ch == '[') {
                    brackets++;
                } else if (ch == ']') {
                    brackets--;
                }
            } else {
                System.out.println("returned false");
                return false;
            }
        }
        return brackets == 0;
    }
/**
 * Demonstrating why a NullPointerException is thrown by Java,
 * without us having to "throw" the exception in the method
 */
//    public static void main(String[] args) {
//        hasBalancedBrackets(null);
//    }
}
