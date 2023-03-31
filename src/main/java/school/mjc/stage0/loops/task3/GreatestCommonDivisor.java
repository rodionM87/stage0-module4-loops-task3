package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0) {
            String str = Integer.toString(second);
            System.out.println(str);
        }
        else if (second == 0) {
            String str = Integer.toString(first);
            System.out.println(str);
        }
        else if (first > 0 && second > 0) {
            if (first == second) {
                String str = Integer.toString(frist);
                System.out.println(str);
            }
            else if (first > second) {
                int resultFirst = 0;
                for (int iter = 1; iter <= first; iter++) {
                    if (first % iter == 0 && second % iter == 0) {
                        resultFirst = iter;
                    }
                }
                String str = Integer.toString(resultFirst);
                System.out.println(str);
            }
            else if (first < second) {
                int resultSecond = 0;
                for (int iter = 1; iter <= second; iter++) {
                    if (first % iter == 0 && second % iter == 0) {
                        resultSecond = iter;
                    }
                }
                String str = Integer.toString(resultSecond);
                System.out.println(str);
            
    }
}
