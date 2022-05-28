package ArrayAssignment;

//import java.text.BreakIterator;

public class CharValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] values = new char[4];
		values[0] = 'j';
		values[1] = 'a';
		values[2] = 'v';
		values[3] = 'a';
		for (char i = 0; i < values.length; i++) {
			char y = values[i];
			System.out.print(y);
			
		}System.out.println();
		
		for (char c : values) {
			System.out.print(c);
		}		 

	}

}
