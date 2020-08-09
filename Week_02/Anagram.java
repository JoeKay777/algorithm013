package wk02;

import java.util.HashMap;
import java.util.Map;
/**
 * 242. 有效的字母异位词
 * @author Joe
 *
 */
public class Anagram {

	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		Map<Character,Integer> charMap = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			int count = charMap.getOrDefault(s.charAt(i), 0);
			count++;
			charMap.put(s.charAt(i), count);
		}
		for (char ch : t.toCharArray()) {
			int count = charMap.getOrDefault(ch, 0);
			if(count == 0) {
				return false;
			}
			count --;
			charMap.put(ch, count);
		}
		return true;
    }
}
