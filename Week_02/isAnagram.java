package LeetCode;

import java.util.HashMap;

public class Test242_1 {
    public static void main(String[] args) {
        isAnagram("anagram","nagaram");
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (Character c: s.toCharArray()) {
            map.put(c,map.get(c)==null?1:map.get(c)+1);
        }
        System.out.println(map);
        for (Character c: t.toCharArray()) {
            if(map.get(c)==null){
                return false;
            }
            int count = map.get(c)-1;
            if(count == 0){
                map.remove(c);
            }else {
                map.put(c, count);
            }
        }
        return map.isEmpty();
    }

    public static boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0){
                return false;
            }
        }
        return true;
    }
}
