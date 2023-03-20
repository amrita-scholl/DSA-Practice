import java.util.ArrayList;
import java.util.Arrays;

public class RangeArraySum {

	public static void main(String args[]) {
		ArrayList<Integer> list=   new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		ArrayList<ArrayList<Integer>> B=  new ArrayList(new ArrayList<Integer>());
		B.add(new ArrayList(Arrays.asList(0,3)));
		B.add(new ArrayList(Arrays.asList(1,4)));

		System.out.println(">>> "+ rangeSum(list,B));
	}
	
	    public static ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
	    	 ArrayList<Long> PS = new ArrayList();
	         ArrayList<Long> res = new ArrayList();
	        // long PS = 0;
	         long sum=0;
	         for(int i=0;i<A.size();i++)
	         {
	             long val =A.get(i)+sum;
	              PS.add(val);
	             sum=PS.get(i);
	         }
	         for(int j=0;j<B.size();j++)
	         {
	             int L = B.get(j).get(0);
	             int R = B.get(j).get(1);
	             long val =  L== 0 ? PS.get(R) : PS.get(R) - PS.get(L-1);
	             res.add(val);
	         }
	     
	         return res;
	    }

	   
	}


