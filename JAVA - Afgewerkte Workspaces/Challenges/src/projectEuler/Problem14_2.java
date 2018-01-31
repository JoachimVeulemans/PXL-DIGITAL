package projectEuler;

public class Problem14_2 {
	public static void main(String[] args) {
		int count = 0;
		int largestChainNumber = 0;
		long largestChain = 0;
		final int CHECK_NUM = 1000001;
		long[] results = new long[CHECK_NUM];

		for (int i = 1; i < CHECK_NUM; i++) {
			System.out.println("Checking: " + i);
			count = 1;
			long current = i;
			
			while (current > 1) {
				if(current >= i) {
					if (current % 2 == 0) {
						current = current / 2;
					} else {
						current = (3 * current) + 1;
					}
					
					count++;
				} else {
					// current is long > cast to int (it's safe to do so here)
					int safe = (int) current;
					count += results[safe]-1; // -1 'cause current is counted already
					break;
				}		
			}
			results[i] = count;

			System.out.println("> Chain of: " + count);
			if (count > largestChain) {
				largestChainNumber = i;
				largestChain = count;
			}
		}
		System.out.println("Grootste chain: " + largestChain + " bij getal: " + largestChainNumber);
	}
}
