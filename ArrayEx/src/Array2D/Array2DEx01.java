package Array2D;

public class Array2DEx01 {
	public static void main(String[] args) {
		int a[][] = new int[3][4];
		a[0][0] = 23 ;
		a[0][1] = 45 ;
		a[0][2] = 13 ;
		a[0][3] = 65 ;
		a[1][0] = 29 ;
		a[1][1] = 63 ;
		a[1][2] = 76 ;
		a[1][3] = 54 ;
		a[2][0] = 9 ;
		a[2][1] = 91 ;
		a[2][2] = 43 ;
		a[2][3] = 72 ;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.println(a[i][j]);
				
			}
		}
		
	}

}
