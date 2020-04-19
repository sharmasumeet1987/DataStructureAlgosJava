
public class TwoDArray {

	public void Rotate(int[][] m) {
		/*
		 *   [1,2,3],   0,0 0,1 0,2
		 *   			1,0 1,1 1,2
  			[4,5,6],	2,0 2,1,2,2
  			[7,8,9]
  			
  			2,0 ->0,0 
  			1,0 ->0,1
		 *  0,0 ->0,2  
		 * 
		 * */
		/*
		 * int x1 = 0, y1 = 0; int[][] f;
		 */
		
		
		for (int j = 0; j < m.length; j++) {
			for (int  i= 0; j < m.length; j++) {
			System.out.print(m[i][j]);	
			}
		}
		
	}
	
}
