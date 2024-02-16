import java.util.Scanner;
public class ArrayTest2 {
    /**
     * 최적화 문제 중 최대값 구하기
     **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력된 점수 중에서 1등 점수를 구하시오");
        System.out.printf("시험에 응시한 학생 수는 몇명입니까? : ");
        String student = sc.next();
        int number = Integer.parseInt(student);
        String[] name = new String[number];
        int[] scores = new int[number];
        System.out.println("응시한 학생의 이름을 입력하세요 : ");
        for (int i=0;i<number;i++){
            String names = sc.next();
        }
        System.out.println("점수를 입력하세요 : ");
        for (int i=0;i<number;i++){
            
        }



        /*int max = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("자연수를 입력 : ");
            scores[i] = sc.nextInt();
            if (scores[i] > max) {
                max = scores[i];
            }*/
        }
        System.out.println("1등 : "+ max);
    }
}