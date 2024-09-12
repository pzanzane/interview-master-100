package validanagram;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch: s.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
                continue;
            }
            map.put(ch, 1);
        }

        for (char ch: t.toCharArray()) {

            if (!map.containsKey(ch)) {
                return false;
            }

            int newCount = map.get(ch) - 1;
            if (newCount <= 0) {
                map.remove(ch);
                continue;
            }

            map.put(ch, newCount);
        }
        return true;
    }
}
