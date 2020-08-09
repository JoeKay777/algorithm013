package wk02;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.����֮��
 * @author Joe
 *
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer , Integer> diffMap = new HashMap<>(); // ��ֵ2-��ֵ1����
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if(diffMap.get(nums[i]) != null) {
				result[0] = diffMap.get(nums[i]);
				result[1] = i;
				return result;
			}
			diffMap.put(target -nums[i],i);
		}
		return null;
	}
}
