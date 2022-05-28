package Array2D;

public class Array2DReverse {
	public static void main(String[] args) {
		int a[][] = new int[3][6];
		a[0][0] = 98 ;
		a[0][1] = 45 ;
		a[0][2] = 71 ;
		a[0][3] = 57 ;
		a[0][4] = 12 ;
		a[0][5] = 82 ;
		a[1][0] = 29 ;
		a[1][1] = 63 ;
		a[1][2] = 76 ;
		a[1][3] = 79 ;
		a[1][4] = 49 ;
		a[1][5] = 65 ;
		a[2][0] = 121 ;
		a[2][1] = 91 ;
		a[2][2] = 43 ;
		a[2][3] = 72 ;
		a[2][4] = 91 ;
		a[2][5] = 63 ;
		
		for (int i = a.length - 1 ; i >= 0; i--) {
			for (int j = a[i].length -1 ; j >= 0 ; j--) {
				
				System.out.println(a[i][j]);
				
			}
		}
		
	}

}


