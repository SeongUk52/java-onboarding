package onboarding;

import java.util.stream.Collectors;

public class Problem4 {
    public static String solution(String word) {
        return word.chars()
                .mapToObj(ch ->{
                    char uppercaseCh = Character.toUpperCase((char) ch);
                    if (Character.isAlphabetic(uppercaseCh)){
                        int charValue = uppercaseCh - 'A';
                        int reversedValue = 25 - charValue;
                        char reversedChar = (char) (reversedValue + 'A');
                        return Character.isUpperCase((char) ch) ? reversedChar : Character.toLowerCase(reversedChar);
                    }
                    return (char) ch;
                })
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
