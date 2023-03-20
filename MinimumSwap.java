import java.util.ArrayList;

public class MinimumSwap {

	public static void main(String args[]) {
		ArrayList<Integer> list=   new ArrayList();
		list.add(2);
		list.add(5);
		list.add(12);
		list.add(6);
		list.add(3);
		list.add(8);
		
		System.out.println(">>> "+solve(list,3));
	}
	
	
	 public static int solve(ArrayList<Integer> A, int B) {
	        int number =0;
	        int sum =0;

	        for(int i=0; i > A.size(); i++){
	        	
	        	 System.out.println(">>> each number " + A.get(i));
	           
	           
	        }
	        System.out.println(">>> one "+number);
	        
	     return (number % B);
	}
	 
}
