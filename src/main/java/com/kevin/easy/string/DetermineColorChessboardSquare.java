package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/12 15:15
 * @Description: 判断国际象棋棋盘中一个格子的颜色
 * 给你一个坐标 coordinates ，它是一个字符串，表示国际象棋棋盘中一个格子的坐标。下图是国际象棋棋盘示意图。
 * 如果所给格子的颜色是白色，请你返回true，如果是黑色，请返回false。
 * <p>
 * 给定坐标一定代表国际象棋棋盘上一个存在的格子。坐标第一个字符是字母，第二个字符是数字。
 */
public class DetermineColorChessboardSquare {

    public static void main(String[] args) {
        System.out.println(squareIsWhite("h3"));
    }

    public static boolean squareIsWhite(String coordinates) {
        return (
                ("aceg".indexOf(coordinates.charAt(0)) != -1 && Character.getNumericValue(coordinates.charAt(1)) % 2 == 0)
                        || ("aceg".indexOf(coordinates.charAt(0)) == -1 && Character.getNumericValue(coordinates.charAt(1)) % 2 != 0)


        );
    }
}
