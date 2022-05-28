package ArrayAssignment;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a = {10 , 20 , 30 };
       int[] aa = {100 , 200 , 300};
       System.out.println(a.length);
       int[]merge = new int[a.length + aa.length];
       System.out.println(merge.length);
       for (int i = 0; i < a.length; i++) {
    	   merge[i] = a[i];
		
	} for (int i = 0; i < aa.length; i++) {
		merge[i + a.length] = aa[i];
			

	}System.out.println(Arrays.toString(  merge));
	}

}
