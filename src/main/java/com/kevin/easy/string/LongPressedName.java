package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/12 16:24
 * @Description: 长按键入
 * <p>
 * 你的朋友正在使用键盘输入他的名字name。偶尔，在键入字符c时，按键可能会被长按，而字符可能被输入 1 次或多次。
 * <p>
 * 你将会检查键盘输入的字符typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回True。
 * <p>
 * 示例 1：
 * <p>
 * 输入：name = "alex", typed = "aaleex"
 * 输出：true
 * 解释：'alex' 中的 'a' 和 'e' 被长按。
 */
public class LongPressedName {

    public static void main(String[] args) {
        System.out.println(isLongPressedName("saeed", "ssaaedd"));
        System.out.println(isLongPressedName("alex", "aaleex"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        int nameIdx = 0;
        int typeIdx = 0;
        int nameLength = name.length();
        int typeLength = typed.length();
        while (nameIdx < nameLength && typeIdx < typeLength) {
            if (name.charAt(nameIdx) != typed.charAt(typeIdx)) {
                return false;
            }
            while (nameIdx < nameLength && typeIdx < typeLength && name.charAt(nameIdx) == typed.charAt(typeIdx)) {
                nameIdx++;
                typeIdx++;
            }
            char prev = name.charAt(nameIdx - 1);
            while (typeIdx < typeLength && typed.charAt(typeIdx) == prev) {
                typeIdx++;
            }
        }
        return nameIdx == nameLength && typeIdx == typeLength;
    }
}
