package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int num = 9;
        for (int iter = 1; iter <= lengthOfLastNumber; iter++) {
            sum += num;
            num = num * 10 + 9;
        }
        System.out.println(sum);
    }
}
