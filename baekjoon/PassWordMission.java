package baekjoon;

import java.util.Scanner;

public class PassWordMission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String password = sc.next();
            if(password.equals("end")) {
                break;
            }
            if(isValid(password)) {
                System.out.println("<" + password + "> is acceptable.");
            } else {
                System.out.println("<" + password + "> is not acceptable.");
            }
        }
        sc.close();
    }

    public static boolean isValid(String password) {
        boolean hasVowel = false;
        int consecutiveVowels = 0;
        int consecutiveConsonants = 0;
        char lastChar = ' ';

        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(isVowel(c)) {
                hasVowel = true;
                consecutiveVowels++;
                consecutiveConsonants = 0;
            } else {
                consecutiveConsonants++;
                consecutiveVowels = 0;
            }
            if(consecutiveVowels > 2 || consecutiveConsonants > 2) return false;
            if(c == lastChar && c != 'e' && c != 'o') return false;
            lastChar = c;
        }
        return hasVowel;
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}