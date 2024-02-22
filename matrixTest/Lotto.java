package matrixTest;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] lottoNum = new int[6];

        for (int i = 0; i < 6; i++) {
            lottoNum[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (lottoNum[i] == lottoNum[j]) {
                    i--; // 중복된 숫자가 발견되면 i를 감소시켜 다시 생성
                    break;
                }
            }
        }
        Arrays.sort(lottoNum);
        for (int num : lottoNum) {
            System.out.print(num + " ");
        }
    }
}