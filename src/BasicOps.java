
public class BasicOps {
	public int Min(int a, int b) {
		return a > b ? b : a;
	}

	public void LoopPrint() {
		/*
		 * Every code must have comments.
		 */
		if (true) {
			System.out.println("This is bount to happen");
		}

		for (int i = 0; i < 5; i++) {
			if (i == 1) {
				i = 3;
			}
			if (i == 3) {
				break;
			}
			System.out.println("Five times!");
		}
	}

	public void TwoDPrint() {
		 int  twoD[][] = new int[4] [];
		 twoD[0] = new int[1];
		 twoD[1] = new int[2];
		 twoD[2] = new int[3];
		 twoD[3] = new int[4];
		 
		 int k = 0;
		 for (int i = 0; i < twoD.length; i++) {
				for (int j = 0; j < i+1; j++) {
					twoD[i][j] = k;
					k++;
				}
			}
		 
		 for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(twoD[i][j]);
			}
			System.out.println();
		}
	}

	public void TryCatch() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
	
	
	public void PrintTrAngle(int n ) {
		
		for (int i = 0; i < n ; i++) {
			
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= 2 * i ; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = 0; i < n ; i++) {
			
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= 2 * i ; j++) {
				System.out.print("*");
			}

			System.out.println();
		}	
		
		
		
		
	}
}


