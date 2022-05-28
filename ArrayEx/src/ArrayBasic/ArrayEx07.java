package ArrayBasic;

public class ArrayEx07 {
	int[] m1() {
		int a[] = new int[3];
		a[0] = 32;
		a[1] = 46;
		a[2] = 12;
		return a;
		
		}
		public static void main(String[] args) {
			ArrayEx07 aa = new ArrayEx07();
			int yy [] = aa.m1();
			for (int i = 0; i < yy.length; i++) {
				System.out.println(yy[i]);
			}
		}
	}



