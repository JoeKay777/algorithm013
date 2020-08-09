package wk02;

/**
 * ½£Ö¸ Offer 49. ³óÊı
 * @author Joe
 *
 */
public class NthUglyNumber {
	public int nthUglyNumber(int n) {
		int[] uglyNum = new int[n];
		uglyNum[0] = 1;
		int p2 = 0,p3 = 0, p5 = 0;
		int i = 1;
		while (i < n) {
			uglyNum[i] = Math.min(Math.min(uglyNum[p2] * 2, uglyNum[p3] * 3), uglyNum[p5] * 5);
			if(uglyNum[i] % 2 == 0) p2++;
			if(uglyNum[i] % 3 == 0) p3++;
			if(uglyNum[i] % 5 == 0) p5++;
			i++;
		}
		
		return uglyNum[n-1];
	}
}

