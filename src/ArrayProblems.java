import java.util.HashMap;

public class ArrayProblems {
	
	boolean isSubstring(String s1, String s2) {
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		for (int i = 0; i < c1.length; i++) {
			if (i<= c1.length - c2.length) {
				if (c1[i] == c2[i]) {
					for (int j = 1; j < c2.length; j++) {
						if (c1[i+j] != c2[j]) {
							i += j;
							break;
						}
						return true;
					}
					
				}
			}
		}
		
		return false;
	}
	
	
	public int maxSizeArray(int[] nums){
	 int max = nums[0];

	 int max_at_ith = 0;
	 for (int i = 0; i < nums.length; i++) {
	 max_at_ith = max_at_ith + nums[i];
	  if(max_at_ith < nums[i]) {
		  max_at_ith = nums[i] ;
	  }
	  max = Math.max(max, max_at_ith);
	 }
		return max;
	}
	
	
	public void moveZeroes(int[] nums) {

		if (nums.length >1) {
			int cnt = 0;
			for (int i = 0; i < nums.length; i++) {
				if(nums[i] != 0 ) {
					
						nums[cnt++] = nums[i];
						
				}
			
	 
			}
			while (cnt< nums.length) {
				nums[cnt++] = 0;
				
			}
		}
	
	}

	public int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		 for (int i = 0; i < nums.length; i++) {
			 
			 if (hMap.containsValue(target - nums[i])) {
				 return new int[]{i, hMap.get(target - nums[i])}; 
			
			}
			hMap.put(i, nums[i]);
		}
		 
		return new int[] {-1,-1};
	}
	
}
