package ArrayBasic;

public class ArrayAlter {
	public static void main(String[] args) {
		int x[] = new int[10];
		x[0] = 14;
		x[1] = 21;
		x[2] = 39;
	    x[3] = 64;
	    x[4] = 25;
	    x[5] = 96;
	    x[6] = 82;
	    x[7] = 110;
	    x[8] = 143;
	    x[9] = 121;
		
		for (int i = 0; i < x.length; i =i+2) {
			System.out.println(x[i]);
			
		}
	}

}
