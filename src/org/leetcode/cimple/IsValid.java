package org.leetcode.cimple;

import java.util.Stack;
// 有效的括号
public class IsValid {
    public boolean isValid(String s) {
        char ch;
        char ch2 = 0;
        int daLeft = 0;
        int daRight = 0;
        int middleLeft = 0;
        int middleRight = 0;
        int smallLeft = 0;
        int smallRight = 0;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (i < s.length() - 1) {
                ch2 = s.charAt(i + 1);
            }
            if (ch == '(') {
                if (ch2 == ']' || ch2 == '}') {
                    return false;
                }
            }
            if (ch == '[') {
                if (ch2 == ')' || ch2 == '}') {
                    return false;
                }
            }
            if (ch == '{') {
                if (ch2 == ')' || ch2 == ']') {
                    return false;
                }
            }
            switch (ch) {
                case '(':
                    smallLeft++;
                    break;
                case ')':
                    if (smallRight <= smallLeft && smallLeft != 0) {
                        smallRight++;
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    middleLeft++;
                    break;
                case ']':
                    if (middleRight <= middleLeft && middleLeft != 0) {
                        middleRight++;
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    daLeft++;
                    break;
                case '}':
                    if (daRight < daLeft && daLeft != 0) {
                        daRight++;
                    } else {
                        return false;
                    }
            }
        }
        if (daLeft > daRight || middleLeft > middleRight || smallLeft > smallRight) {
            return false;
        }

        return true;
    }

    public boolean isValidTwo(String s) {
        int daLeft = 0;
        int daRight = 0;
        int middleLeft = 0;
        int middleRight = 0;
        int smallLeft = 0;
        int smallRight = 0;
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch == ')' || ch == ']' || ch == '}') && stack.size() == 0) {
                return false;
            }
            if (ch == '(' || ch == '[' || ch == '{') {
                switch (ch) {
                    case '(':
                        smallLeft++;
                        break;

                    case '[':
                        middleLeft++;
                        break;

                    case '{':
                        daLeft++;
                        break;
                }
                stack.push(ch);
            } else {
                char ch2 = stack.pop();
                switch (ch2) {
                    case '(':
                        if (ch != ')') {
                            return false;
                        }
                        if (smallRight <= smallLeft && smallLeft != 0) {
                            smallRight++;
                        }

                        break;

                    case '[':
                        if (ch != ']') {
                            return false;
                        }
                        if (middleRight <= middleLeft && middleLeft != 0) {
                            middleRight++;
                        }
                        break;

                    case '{':
                        if (ch != '}') {
                            return false;
                        }
                        if (daRight < daLeft && daLeft != 0) {
                            daRight++;
                        }
                        break;

                }

            }
        }
        if (daLeft > daRight || middleLeft > middleRight || smallLeft > smallRight) {
            return false;
        }
        return true;
    }
}
