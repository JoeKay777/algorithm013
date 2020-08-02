package wk01;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * 26. ɾ�����������е��ظ���

 * ����һ���������飬����Ҫ�� ԭ�� ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�

��Ҫʹ�ö��������ռ䣬������� ԭ�� �޸��������� ����ʹ�� O(1) ����ռ����������ɡ�
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
