package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/12 16:04
 * @Description: 设计 Goal 解析器
 * <p>
 * 请你设计一个可以解释字符串 command 的 Goal 解析器 。command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成。Goal 解析器会将 "G" 解释为字符串 "G"、"()" 解释为字符串 "o"
 * ，"(al)" 解释为字符串 "al" 。然后，按原顺序将经解释得到的字符串连接成一个字符串。
 * <p>
 * 给你字符串 command ，返回 Goal 解析器 对 command 的解释结果。
 * <p>
 * 示例 1：
 * <p>
 * 输入：command = "G()(al)"
 * 输出："Goal"
 * 解释：Goal 解析器解释命令的步骤如下所示：
 * G -> G
 * () -> o
 * (al) -> al
 * 最后连接得到的结果是 "Goal"
 */
public class GoalParserInterpretation {

    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
    }

    public static String interpret(String command) {
        StringBuilder builder = new StringBuilder();
        int idx = 0;
        while (idx < command.length()) {
            if (command.charAt(idx) == '(') {
                if (command.charAt(idx + 1) == ')') {
                    builder.append('o');
                    idx++;
                } else {
                    idx++;
                    while (command.charAt(idx) != ')') {
                        builder.append(command.charAt(idx++));
                    }
                }
                idx++;
            } else {
                builder.append(command.charAt(idx++));
            }
        }
        return builder.toString();
    }
}
