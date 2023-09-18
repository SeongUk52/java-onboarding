package onboarding;

import java.util.stream.IntStream;

public class Problem3 {
    public static int solution(int number) {
        return IntStream.rangeClosed(1,number)
                .map(Problem3::count369)
                .sum();
    }

    public static int count369(int n) {
    int count = 0;
    while (n > 0) {
        int digit = n % 10;
        if (digit == 3 || digit == 6 || digit == 9) {
            count++;
        }
        n /= 10;
    }
    return count;
}

}
