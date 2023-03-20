import java.util.ArrayList;

public class ArrayRotation {

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
	
	
	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		
		 int n = A.size();
	        B = B % n;
	        System.out.println(">>> B>>> "+B);

	        reverseArray(A,0,n-1);
	        System.out.println(">>> "+A);
	        reverseArray(A,0,B-1);
	        System.out.println(">>> "+A);
	        reverseArray(A,B,n-1);
	        return A;
	}
	
	   public static void reverseArray(ArrayList<Integer> A,int start, int end){
	        while (start < end){
	            int temp = A.get(start);
	            A.set(start,A.get(end));
	            A.set(end,temp);
	            start++; end--;
	        }
	   }
}
