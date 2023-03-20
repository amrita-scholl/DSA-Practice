import java.util.ArrayList;

public class FindEquilibriumIndex {

	public static void main(String args[]) {
		
		ArrayList<Integer> list=   new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(">>> "+solve(list));
	}

	public static int solve(ArrayList<Integer> A) {

	        int leftSum=0;
	        int rightSum=0;
	        int num=-1;
	        ArrayList<Integer> array = prefixArray(A);
	        for(int i=0; i < array.size();i++) {
	        	if(i==0) {
	        		leftSum=0;;
	        	} else {
	        		leftSum = array.get(i-1);
	        	}
	        	
	        	rightSum = array.get(array.size()-1) - array.get(i);
	        	
	        	if(leftSum == rightSum) {
	        	num =i;

	        	}
	        	}
	        
	        	return num;
	    }
	
	public static ArrayList<Integer> prefixArray(ArrayList<Integer> A) {
		
		ArrayList<Integer> list = new ArrayList();
		int sum=0;
		
		for(int i=0;i<A.size();i++) {
			
		sum = sum + A.get(i);
		list.add(sum);		
		
		}		
		return list;
		
	}
}
