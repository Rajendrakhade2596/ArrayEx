package ArrayBasic;

public class ArrayReverse {
		
public static void main(String[] args) {

	int a[] = new int[6];
	a[0] = 1;
	a[1] = 2;
	a[2] = 3;
    a[3] = 4;
    a[4] = 5;
    a[5] = 6;
    for (int i = 0 ; i < a.length; i++) {
		
		System.out.println("Orginal Array : " + a[i]);
		
	}
    for (int i = a.length-1; i >= 0; i--) {
    	System.out.println("Reverse Array :" +a[i]);
		
	}
}
}
