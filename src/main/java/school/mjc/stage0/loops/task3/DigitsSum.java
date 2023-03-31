package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int takeLastDigit;
        int sumDigit = 0;
        if (t < 0) {
            t = t * -1;
        }
        int lengthNumber = length(t);
        for (int iterLength = 0; iterLength <= lengthNumber; iterLength++) {
            takeLastDigit = t % 10;
            t = t / 10;
            sumDigit += takeLastDigit;
        }
        String str = Integer.toString(sumDigit);
        System.out.println(str);
    }
    
    public static int length(int t) {
        int length = 0;
        int temp = 1;
        while (temp <= t) {
            length++;
            temp++;
        }
        return length;
    }
}
