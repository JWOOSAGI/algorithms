package matrixTest;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int k = 1;

        for(int i=0;i<arr.length;i++) {
            for (int j=0; j<arr.length;j++){
                arr[i][j] = k;
                System.out.print(arr[i][j]+" ");
                k++;
            }
            System.out.println(" ");

        }
    }
}