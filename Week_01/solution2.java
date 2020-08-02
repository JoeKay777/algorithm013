package wk01;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/rotate-array/
 * 189. 旋转数组

 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 
 * 说明:

尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
要求使用空间复杂度为 O(1) 的 原地 算法。

示例 1:
输入: [1,2,3,4,5,6,7] 和 k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右旋转 1 步: [7,1,2,3,4,5,6]
向右旋转 2 步: [6,7,1,2,3,4,5]
向右旋转 3 步: [5,6,7,1,2,3,4]

 * @author Joe
 *
 */
public class solution2 {

	public void rotate(int[] nums, int k) {
		
		while (k >0) {
			
			int tmp = nums[nums.length-1];
			for(int i = nums.length -1 ; i > 0  ; i--) {
				nums[i] = nums[i-1];
			}
			nums[0] = tmp;
			
			k--;
		}
		
    }
	
	
}
