package SumTwoLinkedLists;

import java.util.LinkedList;

public class sumTwo {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(2);
		l1.add(4);
		l1.add(3);
		l1.add(1);
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		
		l2.add(5);
		l2.add(6);
		l2.add(4);
		
		
		
		System.out.println(addLinkedLists(l1, l2));

	}
	
	public static LinkedList<Integer> addLinkedLists(LinkedList<Integer> a, LinkedList<Integer> b){
		LinkedList<Integer> result = new LinkedList<Integer>();
		
		int sizel1 = a.size();
		int sizel2 = b.size();
		
		int maxInt = Math.max(sizel1, sizel2);
		
		int carry = 0;
		
		for(int i = 0; i < maxInt; i ++) {
			int x = (i < sizel1)? a.get(i):0;
			int y = (i < sizel2)? b.get(i): 0;
			
			int sum = carry + x + y;
			result.add(sum%10);
			carry = sum/10;
			
		}
		
		if(carry > 0) {
			result.add(carry);
		}
		
		return result;
	}

}
