package ArrayBasic;

import java.util.Iterator;

public class ArrayEx06 {
	void m1(String[]y) {
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
		
	}
public static void main(String[] args) {
	ArrayEx06 aa = new ArrayEx06();
	String a[]= new String[5];
	a[0] = "Pune";
	a[1] = "Mumbai";
	a[2] = "Ahmednagar";
	a[4] = "Nagpur";
	aa.m1(a);
	
}
}
