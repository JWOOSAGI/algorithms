package matrixTest;

public class Matrix2 { //getter setter분리
    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int k = 25;
        for (int i =0;i< mtx.length;i++){
            for (int j=0;j< mtx[i].length;j++){
                mtx[i][j] = k;
                k--;
            }
        }
        for (int i =0;i< mtx.length;i++){
            for (int j=0; j< mtx[i].length; j++){
                System.out.print(mtx[i][j]+" ");
            }
            System.out.println();
        }

    }
}
