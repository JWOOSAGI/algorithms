package matrixTest;

import java.util.Arrays;

public class LottoMatching {
    /*
       로또 발급은 같다. 하나는 구매한 로또.
       추가된 로직은 추첨된 로또.
       두 로또의 일치여부에 따라
       다음과 같은 메시지를 출력한다.
       단, 구매로또 번호와 추첨로또 번호 모두 같이 출력한다.
       숫자는 1부터 8까지
       1등은 6개 맞춤
       2등은 5개 맞춤
       3등은 4개 맞춤
       4등은 3개 맞춤
       꽝은 2개 이하
    */
    public static void main(String[] args) {
        int[] lottoNum = new int[6]; //추첨된 로또
        for (int i = 0; i < lottoNum.length; i++) {
            lottoNum[i] = (int) (Math.random() * 8) + 1; //각 숫자는 1 ~ 8 범위 내의 숫자-> 랜덤수 : Math 사용
            for (int j = 0; j < i; j++) {
                if (lottoNum[i] == lottoNum[j]) {
                    i--; // 중복된 숫자가 발견되면 i를 감소시켜 다시 생성 ->서로 겹치지 않는 숫자 6개를 생성
                    break;
                }
            }
        }
        int[] newLottoNum = new int[6]; //구매한 로또
        for (int i = 0; i < newLottoNum.length; i++) {
            newLottoNum[i] = (int) (Math.random() * 8) + 1; //각 숫자는 1 ~ 8 범위 내의 숫자-> 랜덤수 : Math 사용
            for (int j = 0; j < i; j++) {
                if (newLottoNum[i] == newLottoNum[j]) {
                    i--; // 중복된 숫자가 발견되면 i를 감소시켜 다시 생성 ->서로 겹치지 않는 숫자 6개를 생성
                    break;
                }
            }
        }
        Arrays.sort(lottoNum);
        Arrays.sort(newLottoNum);//오름차순 정렬
        for (int num : lottoNum) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num2 : newLottoNum) {
            System.out.print(num2 + " ");
        }
        int matching = 0;
        for (int i = 0; i < lottoNum.length; i++) {
            if (lottoNum[i] == newLottoNum[i]) {
                matching++;
            }
        }
        System.out.println();
        // 등수 출력
        if (matching == 6) {
            System.out.println("1등 - 6개 맞춤");
        } else if (matching == 5) {
            System.out.println("2등 - 5개 맞춤");
        } else if (matching == 4) {
            System.out.println("3등 - 4개 맞춤");
        } else if (matching == 3) {
            System.out.println("4등 - 3개 맞춤");
        } else {
            System.out.println("꽝");
        }
    }
}