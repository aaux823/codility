package com.amason.codility.lessons.lesson3;

import java.util.Arrays;

public class TapeEquilbrium {

	public int solution(int[] A) {
		 if (A.length == 0) {
			 return 0;
		 }
		 
		 if (A.length == 1) {
			 return 1;
		 }
		 
		 int totalSum = 0;
		 int leftSum = 0;
		 int rightSum = 0;
		 
		 int[] sums = new int[A.length-1];

		 for (int i=0; i<A.length; i++) {
			 totalSum += A[i];
		 }
//		 System.out.println("total "+totalSum);
		 
		 
		 for (int i=0; i<A.length-1; i++) {
			 leftSum += A[i];
			//  System.out.println("leftSum "+leftSum);
			 rightSum = totalSum - leftSum;
			//  System.out.println("rightSum "+rightSum);
			//  System.out.println("leftSum - rightSum "+(leftSum - rightSum));
			 sums[i] = Math.abs(leftSum - rightSum);
		 }
		 
		 Arrays.sort(sums);
		 
		 return sums[0];
		 
	 }

	 
	 
	 public static void main(String[] args) {
		 TapeEquilbrium tapeEquilibrium = new TapeEquilbrium();
		 int result = tapeEquilibrium.solution(new int[]{3,1,2,4,3});
		 System.out.println(result);
	 }
}

