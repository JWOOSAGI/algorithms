package changeMission;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1000 - sc.nextInt();
        int change = 0;
        int[] arr = {500, 100, 50, 10, 5, 1};
        for (int j = 0; j < arr.length; j++) {
            if (i % arr[j] >= 0) {
                change += i / arr[j];
                i = i % arr[j];
            }
        }
        System.out.println(change);
    }
}