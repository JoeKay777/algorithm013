package wk01;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * 26. 删除排序数组中的重复项

 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
eg:nums = [0,0,1,1,1,2,2,3,3,4]
 * @author Joe
 *
 */
public class solution01 {

	public int removeDuplicates(int[] nums) {
		
		int size = 0;
		l: for (int i = 0 ; i < nums.length; i++) {
			for (int j = 0; j < i ; j++) {
				if(nums[j] == nums[i]) {
					continue l;
				}
			}
			
			nums[size++] = nums[i];
		}
		return size;
	}
}
