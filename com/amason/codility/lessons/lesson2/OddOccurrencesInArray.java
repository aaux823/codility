package aauxilio.java.codility;

import java.util.*;

public class OddOccurrencesInArray {
	
	public int solution(int[] A) {
		
		if (A.length == 0) {
			return 0;
		}
		
		
		if (A.length == 1) {
			return A[0];
		}
		
		Set<Integer> numSet = new HashSet();
		
		for (int i=0; i<A.length; i++) {
			if (numSet.contains(A[i])) {
				numSet.remove(A[i]);
			} else {
				numSet.add(A[i]);
			}
		}
		
		return numSet.iterator().next();
		
	}
	
	public static void main(String[] args) {
		OddOccurrencesInArray program = new OddOccurrencesInArray();
        System.out.println(program.solution(new int[]{}));
        System.out.println(program.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
	}

}
