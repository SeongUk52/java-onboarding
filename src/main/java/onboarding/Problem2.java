package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        while (cryptogram.length()>1){
            boolean hasCrypto = false;
            for (int i = 1 ; i < cryptogram.length() ; i++){
                if (cryptogram.charAt(i-1) == cryptogram.charAt(i)){
                    if ( i == 1 ){
                        cryptogram = cryptogram.substring(2);
                        hasCrypto = true;
                        continue;
                    }
                    cryptogram = cryptogram.substring(0,i-1) + cryptogram.substring(i+1);
                    System.out.println(cryptogram);
                    hasCrypto = true;
                }
            }
            if (!hasCrypto)
                break;
        }
        return cryptogram;
    }
}
