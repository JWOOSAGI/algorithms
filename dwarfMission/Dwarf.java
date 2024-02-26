package dwarfMission;
import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] heights = new int[9];
        int sum = 0;
        int fakeA = 0, fakeB = 0;

        for (int i = 0; i < heights.length; i++) { // 난쟁이 키 입력
            heights[i] = sc.nextInt();
            sum += heights[i]; // sum은 난쟁이 9명의 키의 합
        }
        Arrays.sort(heights); //키를 오름순서로 정렬

        for(int i = 0; i < heights.length-1; i++) { //브루트 포스
            for(int j = i+1; j < heights.length; j++) {
                if(sum - heights[i] - heights[j] == 100) { //핵심
                    fakeA = i;
                    fakeB = j;
                    break;
                }
            }
        }

        for(int j = 0; j < heights.length; j++) { // 진짜 난쟁이 키 출력
            if(j == fakeA || j == fakeB) //주의
                continue;
            System.out.println(heights[j]);
        }
    }
}