package com.amason.codility.lessons.lesson3;

public class FrogJmp {
	
	public int solution(int X, int Y, int D) {
		if (D == 0 || X == Y || Y < X) {
			return 0;
		}
		
		int distance = Y-X;
		int reminder = distance % D;
		double jumps = Math.ceil(distance/D);
		System.out.print(jumps);
		System.out.print("reminder " +reminder);

		if (reminder > 0) {
			return (int) jumps + 1;
		}
		return (int) jumps;
	}
	
	public static void main(String[] args) { 
		FrogJmp jmp = new FrogJmp();
		int result = jmp.solution(10, 85, 30);
		System.out.print(result);
	}

}
