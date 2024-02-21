package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MemberView {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);
        System.out.println("id, 비밀번호, 비밀번호 확인, 이름, 주민번호, 전화번호, 주소, 직업을 입력 : ");
        MemberModel model = new MemberModel(sc.next(), sc.next(),sc.next(),
                sc.next(),sc.next()
        ,sc.next(),sc.next(),sc.next());

        System.out.println(model.toString());
    }
}