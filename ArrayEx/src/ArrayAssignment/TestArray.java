package ArrayAssignment;

public class TestArray {
public static void main(String[] args) {
	int a[]  = new int[5];
	a[0] = 10;
	a[1] = 20 ; 
	a[2] = 70 ;
	a[3] = 40 ;
	a[4] = 50 ;
	 for (int i = a.length-1; i >= 0 ; i=i-3) {
		 System.out.println(a[i]);
		
	}
}
}
