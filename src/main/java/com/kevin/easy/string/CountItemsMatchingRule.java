package com.kevin.easy.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: kai Li
 * Date: 2021/3/18 19:21
 * @Description: 统计匹配检索规则的物品数量
 * 给你一个数组 items ，其中items[i] = [typei, colori, namei] ，描述第 i 件物品的类型、颜色以及名称。
 * <p>
 * 另给你一条由两个字符串ruleKey 和 ruleValue 表示的检索规则。
 * <p>
 * 如果第 i 件物品能满足下述条件之一，则认为该物品与给定的检索规则 匹配 ：
 * <p>
 * ruleKey == "type" 且 ruleValue == typei 。
 * ruleKey == "color" 且 ruleValue == colori 。
 * ruleKey == "name" 且 ruleValue == namei 。
 * 统计并返回 匹配检索规则的物品数量
 */
public class CountItemsMatchingRule {

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>() {{
            add(Arrays.asList("phone", "blue", "pixel"));
            add(Arrays.asList("computer", "silver", "phone"));
            add(Arrays.asList("phone", "gold", "iphone"));
        }};
        System.out.println(countMatches(items, "type", "phone"));

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = ruleKey.equals("type") ? 0 : (ruleKey.equals("color") ? 1 : 2);
        return (int) items.stream().filter(item -> item.get(idx).equals(ruleValue)).count();
    }
}
