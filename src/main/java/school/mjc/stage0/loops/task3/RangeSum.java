package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int iter = 0;
        int result = 0;
        while (iter <= secondBoarder) {
            result += firstBoarder;
            firstBoarder += firstBoarder;
            String str = Integer.toString(result);
            System.out.println(str);
            iter++;
        }
    }
}
