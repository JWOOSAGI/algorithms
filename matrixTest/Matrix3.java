package matrixTest;
public class Matrix3 {
    public static void main(String[] args) {
        // 1단부터 5단 출력
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
            System.out.println();
        }

        System.out.println();

        // 6단부터 9단 출력
        for (int i = 1; i <= 9; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
            System.out.println();
        }
    }
}
