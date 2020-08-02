package wk01;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/rotate-array/
 * 189. ��ת����

 * ����һ�����飬�������е�Ԫ�������ƶ� k ��λ�ã����� k �ǷǸ�����
 * 
 * ˵��:

�������������Ľ�����������������ֲ�ͬ�ķ������Խ��������⡣
Ҫ��ʹ�ÿռ临�Ӷ�Ϊ O(1) �� ԭ�� �㷨��

ʾ�� 1:
����: [1,2,3,4,5,6,7] �� k = 3
���: [5,6,7,1,2,3,4]
����:
������ת 1 ��: [7,1,2,3,4,5,6]
������ת 2 ��: [6,7,1,2,3,4,5]
������ת 3 ��: [5,6,7,1,2,3,4]

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
