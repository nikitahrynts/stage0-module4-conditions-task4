package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int temp = first > second ? first : second;
        int result = third > temp ? third : temp;
        System.out.println(result);
    }
}
