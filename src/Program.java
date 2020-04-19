import java.io.IOException;

public class Program {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		SortingAlgo srt = new SortingAlgo();
		int[] arr = new int[] { 0,3,2,7,3,5,9,5,8,4,2};
		srt.MergeSort(arr, 0, arr.length -1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
		
		System.out.println();
		ArrayProblems probs = new ArrayProblems();
		int[] nums = new int[] {1};
		int x = probs.maxSizeArray(nums);
		
		int[] move = new int[] {1,0,1};
		probs.moveZeroes(move);
		
		for (int i = 0; i < move.length; i++) {
			System.out.print(move[i]);
		}
		System.out.println();
		int[][] m = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();System.out.println();
		for (int j = 0; j < m.length; j++) {
			for (int i = m.length-1; i >=0; i--) {
				  m[j][i] = m[i][j];
				//System.out.print(m[i][j] + " ");
			}
			//System.out.println();
		}
		System.out.println();System.out.println();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		/*
		 * int[] coins = new int[] {1,3,4}; DynamicProg dp = new DynamicProg(coins); int
		 * best = dp.solve(10);
		 * 
		 * System.out.println(" best is " + best);
		 */
		
		BasicOps obj = new BasicOps();
		/*
		 * obj.TwoDPrint();
		 */
		
		obj.PrintTrAngle((5));
		
		char ch1, ch2;
		char[] ch;
		ch2 = 88;
		
		int x1 = 0b1010;
		System.out.println(x1);
		/*
		 * for (char i = 1; i < 63; i++) { System.out.print(4* i); System.out.print(4* i
		 * -1); System.out.print(4* i -2); System.out.print(4* i - 3);
		 * System.out.println();
		 * 
		 * }
		 */
		System.out.println(ch2);
		
		
		/*
		 * int num; num = 5;
		 * 
		 * num *= 2; System.out.println("The value of num after manipulation is ");
		 * System.out.print(num);
		 * 
		 * BasicOps obj = new BasicOps();
		 * 
		 * System.out.print("Min of the two numbers is " + obj.Min(4, 5));
		 * 
		 * try { File myObj = new File("filename.txt"); if (myObj.createNewFile()) {
		 * System.out.println("File created: " + myObj.getName()); } else {
		 * System.out.println("File already exists."); } } catch (IOException e) {
		 * System.out.println("An error occurred."); e.printStackTrace(); }
		 */
	}
}
