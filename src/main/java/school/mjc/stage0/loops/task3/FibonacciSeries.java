package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstVar = 0;
        int secondVar = 1;
        int result;
        for (int iter = 0; iter < lastFibonacci; iter++) {
            String str = Integer.toString(firstVar);
            System.out.println(str);
            result = firstVar + secondVar;
            firstVar = secondVar;
            secondVar = result;
        }
    }
}
