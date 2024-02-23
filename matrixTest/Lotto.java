package matrixTest;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] lottoNum = new int[6];

        for (int i = 0; i < lottoNum.length; i++) {
            lottoNum[i] = (int) (Math.random() * 45) + 1; //각 숫자는 1 ~ 45 범위 내의 숫자-> 랜덤수 : Math 사용
            for (int j = 0; j < i; j++) {
                if (lottoNum[i] == lottoNum[j]) {
                    i--; // 중복된 숫자가 발견되면 i를 감소시켜 다시 생성 ->서로 겹치지 않는 숫자 6개를 생성
                    break;
                }
            }
        }
        for (int i=0;i< lottoNum.length;i++){
            for (int j=0;j< lottoNum.length-1;j++){
                if (lottoNum[j] > lottoNum[j+1]){
                    int temp = lottoNum[j];
                    lottoNum[j] = lottoNum[j+1];
                    lottoNum[j+1] = temp;
                }
            }
        }
//        Arrays.sort(lottoNum); //오름차순 정렬
        for (int num : lottoNum) {
            System.out.print(num + " ");
        }

    }
}