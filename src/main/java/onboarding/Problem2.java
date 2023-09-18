package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < cryptogram.length(); i++) {
            if (result.length() > 0 && result.charAt(result.length() - 1) == cryptogram.charAt(i)) {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(cryptogram.charAt(i));
            }
        }

        return result.toString();

    }
}
