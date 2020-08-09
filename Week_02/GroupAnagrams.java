package wk02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 49. ×ÖÄ¸ÒìÎ»´Ê·Ö×é
 * @author Joe
 *
 */
public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> anagramMap = new HashMap<>();
		for (String str : strs) {
			char[] sortChar = str.toCharArray();
			Arrays.sort(sortChar);
			String key = new String(sortChar);
			List<String> list = anagramMap.get(key);
			if(list == null) {
				list = new ArrayList<>();
				anagramMap.put(key, list);
			}
			list.add(str);
		}
		return new ArrayList<>(anagramMap.values());
	}
}
