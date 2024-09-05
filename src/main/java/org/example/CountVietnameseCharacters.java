package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountVietnameseCharacters {
    public static void main(String[] args) {
        String inputString = "hwfdawhwhcoomddfgwdc";
        int count = countVietnameseCharacters(inputString);
        System.out.println("Số lượng chữ cái có dấu Tiếng Việt: " + count);
    }

    public static int countVietnameseCharacters(String s) {
        Map<String, Character> mapping = new HashMap<>();
        mapping.put("aw", 'ă');
        mapping.put("aa", 'â');
        mapping.put("dd", 'đ');
        mapping.put("ee", 'ê');
        mapping.put("oo", 'ô');
        mapping.put("ow", 'ơ');
        mapping.put("w", 'ư');

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && mapping.containsKey(s.substring(i, i + 2))) {
                count++;
                int i1 = i++;
            }
            else if (mapping.containsKey(String.valueOf(s.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}
