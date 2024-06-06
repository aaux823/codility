package aauxilio.java.codility;

public class BinaryGap {

    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);

        int maxBinaryGap = 0;
        int binaryGap = 0;
        boolean prevIsZero = false;


        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                binaryGap++;
                prevIsZero = true;
            } else {
                if (prevIsZero) {
                    maxBinaryGap = Math.max(maxBinaryGap, binaryGap);
                    binaryGap = 0;
                    prevIsZero = false;
                }
            }

        }
        return maxBinaryGap;
    }

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        System.out.println(binaryGap.solution(9));
        System.out.println(binaryGap.solution(529));
        System.out.println(binaryGap.solution(20));
        System.out.println(binaryGap.solution(32));
    }
}