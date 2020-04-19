
public class DynamicProg {
	public DynamicProg(int[] coins) {
		_coins = coins;
		for (int i = 0; i < ready.length; i++) {
			ready[i] = false;
		}
	}
	int MAX = 1000;
	
	Boolean[] ready = new Boolean[MAX];
	int[] value= new int[MAX];
	int[] _coins;
	
	public int solve(int x) {
		/*
		 * if(x < 0) return 1000; if(x == 0) return 0;
		 * 
		 * if(ready[x]) return value[x]; int best= 1000; for (int i = 0; i <
		 * _coins.length; i++) { best = Math.min(best, solve(x - _coins[i]) + 1); }
		 * value[x] = best; ready[x] = true;
		 * 
		 * return value[x];
		 */
		 if(x < 0) return 1000; if(x == 0) return 0;
		  
		 if(ready[x]) return value[x];
		 value[x] = 1000;
		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < _coins.length; j++) {
				value[x] = Math.min(value[x], solve(x - _coins[i]) + 1);
			}
			
		}
		return value[x];
	}
}
