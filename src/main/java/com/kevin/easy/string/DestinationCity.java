package com.kevin.easy.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: kai Li
 * Date: 2021/4/8 19:04
 * @Description:  旅行终点站
 * 给你一份旅游线路图，该线路图中的旅行线路用数组 paths 表示，其中 paths[i] = [cityAi, cityBi] 表示该线路将会从 cityAi 直接前往 cityBi
 * 。请你找出这次旅行的终点站，即没有任何可以通往其他城市的线路的城市。
 *
 * 题目数据保证线路图会形成一条不存在循环的线路，因此只会有一个旅行终点站
 */
public class DestinationCity {

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London","New York"));
        paths.add(Arrays.asList("New York","Lima"));
        paths.add(Arrays.asList("Lima","Sao Paulo"));
        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        HashSet<String> outgoingPathCities = new HashSet<>();
        HashSet<String> cities = new HashSet<>();
        for (List<String> path : paths) {
            outgoingPathCities.add(path.get(0));
            cities.add(path.get(0));
            cities.add(path.get(1));
        }
        for (String city : cities) {
            if (!outgoingPathCities.contains(city)) {
                return city;
            }
        }
        return "";
    }
}
