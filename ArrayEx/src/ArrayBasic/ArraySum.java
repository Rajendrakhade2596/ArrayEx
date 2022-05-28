package ArrayBasic;


public class ArraySum{
	int sum = 0;
	void m1 (int[]y) {
		 for (int i = 0; i < y.length; i++) {
			
		 sum  = sum + y[i];
						}
		 System.out.println(sum );
	}
	public static void main(String[] args) {
		ArraySum aa = new ArraySum();
			int a[] = new int [6];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
	    a[3] = 4;
	    a[4] = 5;
	    a[5] = 6;
	    aa.m1(a);
		}
	

}
