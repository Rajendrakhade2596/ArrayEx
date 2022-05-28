package ArrayBasic;

public class ArrayEx01 {
	public static void main(String[] args) {
		int a[]= new int [6];
		a[0]=42;
		a[4] = 98;
		
		for(int i = 0 ; i< a.length ; i++) {
			int yy = a[i];
			System.err.println(yy);
		}
	}

}
