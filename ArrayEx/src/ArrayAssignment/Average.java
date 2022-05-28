package ArrayAssignment;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nums[] = { 10.1 , 11.2 , 12.3 , 13.4 , 14.5};
		 double result = 0;
		
		 for (int j = 0; j < nums.length; j++) {
			 result = result + nums[j];
			 }
			 
			 System.out.println("Average is :" + result/5);
			
		}

	}


