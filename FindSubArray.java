import java.util.ArrayList;

public class FindSubArray {

	
	public static void main(String args[]) {
		ArrayList<Integer> list=   new ArrayList();
		list.add(2);
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(1);
		list.add(8);
		
		System.out.println(">>> "+solve(list,3 , 11));
	}
	
    public static int solve(ArrayList<Integer> A, int B, int C) {
        
        int val=0;
        int count=0;
       
        for(int i=0;i< B;i++){
        	 val = val+ A.get(i);
        	 
        }
        for(int i = 1; i < (A.size() - B); i++){
        	val -= A.get(i - 1) + A.get(i + B - 1);
        	if(val == C){
        		count++;
        		}
        	}
        return count;
    }
}
