package ArrayBasic;

public class ArrayOdd {
	int sum = 0;
	void m1(int []d ){
		for (int i = 0; i < d.length; i++) {
			if (d[i]%2 == 1) {
				sum = sum + d[i];
	
						}
		}System.out.println(sum);
	}public static void main(String[] args) {
		ArrayOdd xx = new ArrayOdd();
		
		int a[] = new int [10];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
	    a[3] = 4;
	    a[4] = 5;
	    a[5] = 6;
	    a[6] = 8;
	    a[7] = 10;
	    a[8] = 13;
	    a[9] = 11;
	    xx.m1(a);
       
}
}
