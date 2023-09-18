package onboarding;

import java.util.List;

class Problem1 {
    private static final int pobiWin = 1;
    private static final int crongWin = 2;
    private static final int draw = 0;
    private static final int unexpected = -1;
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        if (pobi.get(1) - pobi.get(0) != 1 )
            return unexpected;
        if (crong.get(1) - crong.get(0) != 1 )
            return unexpected;
        Integer pobiValue = maxNumberInPerson(pobi);
        Integer crongValue = maxNumberInPerson(crong);
        if (pobiValue > crongValue) {
            answer = pobiWin;
        }
        if (crongValue > pobiValue){
            answer = crongWin;
        }
        if (crongValue.equals(pobiValue)){
            answer = draw;
        }
        return answer;
    }
    public static Integer maxNumberInPerson(List<Integer> person){
        Integer firstPage = maxNumberInPage(person.get(0));
        Integer secondPage = maxNumberInPage(person.get(1));
        return Integer.max(firstPage,secondPage);
    }

    public static Integer maxNumberInPage(Integer page){
        Integer sum = sumPage(page);
        Integer mult = multPage(page);
        return Integer.max(sum,mult);
    }

    public static Integer sumPage(Integer page){
        Integer sum = 0;
        int[] digits = intToArray(page);
        for (Integer i : digits){
            sum += i;
        }
        return sum;
    }

    public static Integer multPage(Integer page){
        Integer mult = 1;
        int[] digits = intToArray(page);
        for (Integer i : digits){
            mult *= i;
        }
        return mult;

    }

    public static int[] intToArray(Integer integer){

        String temp = Integer.toString(integer);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
            digits[i] = temp.charAt(i) - '0';
        return digits;
    }
}