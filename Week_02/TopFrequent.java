package wk02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 347. 前 K 个高频元素
 * 
 * @author Joe
 *
 */
public class TopFrequent {

	public int[] topKFrequent(int[] nums, int k) {
		// 统计元素频次
		Map<Integer, Integer> freMap = new HashMap<>();
		for (int i : nums) {
			Integer count = freMap.getOrDefault(i, 0);
			count ++;
			freMap.put(i, count);
		}
		Queue<Pair> queue = new PriorityQueue<Pair>();
		for (Integer key : freMap.keySet()) {
			queue.add(new Pair(key, freMap.get(key)));
		}
		int[] result = new int[k];
		int i = 0;
		while (i < k && !queue.isEmpty()) {
			Pair pair = queue.poll();
			result[i] = pair.key;
			i++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		TopFrequent tf = new TopFrequent();
		tf.topKFrequent(new int[] {1,1,1,2,2,3}, 2);
	}
	
	class Pair implements Comparable<Pair>{
		Integer key;
		Integer count;
		
		public Pair(Integer key, Integer count) {
			this.key = key;
			this.count = count;
		}
		@Override
		public int compareTo(Pair o) {
			return o.count.compareTo(this.count);
		}
	}
}
