package ArrayAssignment;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2 , 3 , 4 , 5 , 8 , 9 };
		int b[] = new int [6];
		
		System.out.println("array a:");
		System.out.println("[");
		for (int i = 0; i < a.length; i++) {
			System.out.println(" " +a[i]);
			
		}System.out.println("]");
		System.out.println("\narray b :");
		System.out.println("[");
		for (int j = 0; j < a.length; j++) {
			b[j] = a[j];
			System.out.println(" " + b[j]);
			
		}
        System.out.println("]");
	}

}
