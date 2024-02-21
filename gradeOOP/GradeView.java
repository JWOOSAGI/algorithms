package gradeOOP;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeModel model = new GradeModel(sc.next());

        System.out.println("다음은 한 학생의 과목 점수이다.");

        System.out.printf("이름 : ");
        String name = sc.next();
        model.setUserName(name);

        System.out.printf("국어점수 : ");
        int kor = sc.nextInt();
        model.setKor(kor);

        System.out.printf("영어점수 : ");
        int eng = sc.nextInt();
        model.setEng(eng);

        System.out.printf("수학점수 : ");
        int math = sc.nextInt();
        model.setMath(math);

        System.out.println("평균 점수를 구하시오");
        int avg = (kor+eng+math)/3;
        model.setAvg(avg);

        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : "+model.getUserName());
        System.out.println("국어점수 : "+model.getKor());
        System.out.println("영어점수 : "+model.getEng());
        System.out.println("수학점수 : "+model.getMath());
        System.out.println("평균 점수: "+model.getAvg());

    }
}