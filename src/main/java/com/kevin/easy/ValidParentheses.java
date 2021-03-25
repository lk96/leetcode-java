package com.kevin.easy;

import java.util.Stack;

/**
 * @Author: kai Li
 * Date: 2021/3/17 14:28
 * @Description: 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        String starting = "({[";
        String ending = ")}]";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (starting.indexOf(c) != -1) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || starting.indexOf(stack.pop()) != ending.indexOf(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
