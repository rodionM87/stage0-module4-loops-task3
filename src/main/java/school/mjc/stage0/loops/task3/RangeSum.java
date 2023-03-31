package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        System.out.println(sumNatural(secondBoarder) - sumNatural(firstBoarder - 1));
    }
    public static int sumNatural(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }
}
