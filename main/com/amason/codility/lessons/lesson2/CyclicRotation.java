package com.amason.codility.lessons.lesson2;

import java.util.*;

public class CyclicRotation {

	
	public int[] solution(int[] A, int K) {
		if (A.length == 0 || K == 0 || A.length == 1 || K == A.length) {
            return A;
        }
		
		for (int i=0; i<K; i++) {
			int last=A[A.length - 1];
//			System.out.println("last "+last);
			for (int j=A.length - 1; j>0; j--) {
				A[j] = A[j-1];

			}
			A[0] = last;
		}

		
		return A;
	}
	
	
	public static void main(String[] args) {
		CyclicRotation cr = new CyclicRotation();
//		int[] result = cr.solution(new int[] {3, 8, 9, 7, 6}, 3);
//		int[] result = cr.solution(new int[] {0, 0, 0}, 1);
		int[] result = cr.solution(new int[] {1, 2, 3, 4}, 4);
		for(int i : result) {
		System.out.print(i + " ");
		}
	}
}
