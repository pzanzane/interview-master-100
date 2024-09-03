package validparenthesis;

import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        if (s.length() <= 1) {
            return false;
        }

        for (Character ch: s.toCharArray()) {

            if (!(ch.equals(')') || ch.equals(']') || ch.equals('}'))) {
                stack.add(ch);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            Character popedChar = stack.pop();
            switch (ch) {
                case ')':
                    if (popedChar.equals('(')) {
                        continue;
                    }
                    return false;
                case ']':
                    if (popedChar.equals('[')) {
                        continue;
                    }
                    return false;
                case '}':
                    if (popedChar.equals('{')) {
                        continue;
                    }
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
