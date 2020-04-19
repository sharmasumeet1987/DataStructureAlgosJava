
public class SortingAlgo {
	
	public void MergeSort(int[] arr, int l , int r) {
		if (l < r) {
			
			int m = l + (r -l)/2;
			
			MergeSort(arr, l, m);
			MergeSort(arr, m +1, r);
			Merge(arr, l, m, r);
		}

		
	}
	
	private void  Merge(int[] arr, int l, int m, int r) {
		
		int l1 = m - l + 1;
		int l2 = r-m;
		int[] left = new int[l1];
		int[] right = new int[l2];
		for (int i = 0; i < l1; i++) {
			left[i] = arr[i + l];
		}
		for (int i = 0; i < l2; i++) {
			right[i] = arr[i + m +1 ];
		}
		int i= 0, j = 0, k =l;
		while(i < l1 && j < l2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			} else {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i <l1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < l2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

}
