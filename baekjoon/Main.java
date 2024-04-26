package baekjoon;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        if(N == M) System.out.println(1);
        else System.out.println(0);
    }

}
=======
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {  //0 일때 영문명 출력
            System.out.print("YONSEI");
        } else {  //N = 1일때 슬로건 출력
            System.out.print("Leading the Way to the Future");
        }
    }
}
>>>>>>> d45f99e9ae0382292020759465ad6ba9aea31186
