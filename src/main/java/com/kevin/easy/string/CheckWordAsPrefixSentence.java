package com.kevin.easy.string;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @Author: kai Li
 * Date: 2021/4/8 16:18
 * @Description: 检查单词是否为句中其他单词的前缀
 * 给你一个字符串 sentence 作为句子并指定检索词为 searchWord ，其中句子由若干用 单个空格 分隔的单词组成。
 * <p>
 * 请你检查检索词 searchWord 是否为句子 sentence 中任意单词的前缀。
 * <p>
 * 如果searchWord 是某一个单词的前缀，则返回句子sentence 中该单词所对应的下标（下标从 1 开始）。
 * 如果 searchWord 是多个单词的前缀，则返回匹配的第一个单词的下标（最小下标）。
 * 如果 searchWord 不是任何单词的前缀，则返回 -1 。
 * 字符串 S 的 前缀 是 S 的任何前导连续子字符串。
 */
public class CheckWordAsPrefixSentence {

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg" ));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        Node root = new Node('-');
        String[] words = sentence.split("\\s+" );
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            addWord(words[i], root, 0);
            if (!indexMap.containsKey(words[i])) {
                indexMap.put(words[i], i + 1);
            }
        }
        for (int i = 0; i < searchWord.length(); i++) {
            char c = searchWord.charAt(i);
            if (!root.map.containsKey(c)) {
                return -1;
            }
            root = root.map.get(c);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return indexMap.get(s1) - indexMap.get(s2);
            }
        });
        pq.addAll(root.words);
        return indexMap.get(pq.poll());
    }

    private static void addWord(String word, Node root, int idx) {
        if (idx == word.length()) {
            return;
        }
        char c = word.charAt(idx);
        if (!root.map.containsKey(c)) {
            root.map.put(c, new Node(c));
        }
        Node next = root.map.get(c);
        next.words.add(word);
        addWord(word, next, idx + 1);
    }
}

class Node {
    char c;
    Map<Character, Node> map;
    Set<String> words;

    public Node(char c) {
        this.c = c;
        map = new HashMap<>();
        words = new HashSet<>();
    }
}