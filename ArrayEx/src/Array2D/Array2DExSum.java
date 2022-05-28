package Array2D;

public class Array2DExSum {
	
	public static void main(String[] args) {
	int a[][] = new int[6][2];
	a[0][0] = 76 ;
	a[0][1] = 54 ;
	a[1][0] = 87 ;
	a[1][1] = 46 ;
	a[2][0] = 24 ;
	a[2][1] = 97 ;
	a[3][0] = 23 ;
	a[3][1] = 74 ;
	a[4][0] = 90 ;
	a[4][1] = 81 ;
	a[5][0] = 125 ;
	a[5][1] = 56 ;
	int sum = 0;
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			sum = sum + a[i][j];
		}
	} System.out.println(sum);
  }
}


