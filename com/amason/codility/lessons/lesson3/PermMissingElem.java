package aauxilio.java.codility;

import java.util.Arrays;

public class PermMissingElem {

	 public int solution(int[] A) {
		 if (A.length == 0 || (A.length == 1 && A[0] != 1)){
			 return 1;
		 }
		 
		  
		 Arrays.sort(A);
		 int prev = A[0];
		 if (prev !=1) {
			 return 1;
		 }
		 
		 for (int i=1; i<A.length; i++) {
			 int curr = A[i];
			 if (curr - prev != 1) {
				 return prev + 1;
			 }
			 prev = curr;
		 }
		 return prev + 1;
	 }
	 
	public static void main(String[] args) { 
		PermMissingElem perm = new PermMissingElem();
		int result = perm.solution(new int[]{2,3,1,4,5});
		System.out.println(result);
	}
}
