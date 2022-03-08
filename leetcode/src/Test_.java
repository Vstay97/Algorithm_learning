import java.util.*;

/**
 * @author Vstay
 * @date 2022/1/20 11:35
 */
public class Test_ {
    public static void main(String[] args) {
        String s = new String("hello");
        String t = new String("lo");

        HashMap<Character, Integer> need = new HashMap<>();
        for (char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int left = 0, right = 0;
        int valid = 0;
        while(right < s.length()){
            // c 是将移⼊窗⼝的字符
            char c = s[right];
        }

    }

    void slidingWindow(string s, string t) {
        unordered_map<char, int> need, window;
        for (char c : t) need[c]++;

        int left = 0, right = 0;
        int valid = 0;
        while (right < s.size()) {
            // c 是将移⼊窗⼝的字符
            char c = s[right];
            // 右移窗⼝
            right++;
            // 进⾏窗⼝内数据的⼀系列更新
 ...
            /*** debug 输出的位置 ***/
            printf("window: [%d, %d)\n", left, right);
            /********************/

            // 判断左侧窗⼝是否要收缩
            while (window needs shrink) {
                // d 是将移出窗⼝的字符
                char d = s[left];
                // 左移窗⼝
                left++;
                // 进⾏窗⼝内数据的⼀系列更新
 ...
            }
        }
    }

    /* 滑动窗口算法框架 */
    void slidingWindow(String s, String t) {
        // 字符需要出现的次数
        Map<Character, Integer> needs = new HashMap<Character, Integer>();
        // 滑动窗口中字符出现的次数
        Map<Character, Integer> window = new HashMap<Character, Integer>();

        for (char ch : t.toCharArray())
            needs.put(ch, needs.getOrDefault(ch, 0)+1);

        int left = 0, right = 0;
        int valid = 0;
        while (right < s.length()) {
            // c 是将移入窗口的字符
            char c = s.charAt(right);
            // 如果满足条件就将 c移入窗口中，并进行窗口内数据的一系列更新
            if(...)
        	    ...
            // 右移窗口
            right++;


            /*** debug 输出的位置 ***/
            System.out.println("window: ["+left+", "+right+")\n");
            /********************/

            // 判断左侧窗口是否要收缩
            while (window needs shrink) {
                // d 是将移出窗口的字符
                char d = s.charAt(left);
                // 如果满足一定条件，进行窗口内数据的一系列更新，使得退出这个 while循环
                if(...)
            	    ...
                // 左移窗口
                left++;
            }
        }
    }
