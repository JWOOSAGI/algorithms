package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MemberView {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);
        MemberModel model = new MemberModel();

        System.out.printf("id를 입력해주세요 : ");
        String id = sc.next();
        model.setUserID(id);

        System.out.printf("비밀번호를 입력해주세요 : ");
        String pw = sc.next();
        model.setPassWord(pw);

        System.out.printf("비밀번호를 한번 더 입력해주세요 : ");
        String pwAgain = sc.next();
        model.setPassWordAgain(pwAgain);

        System.out.printf("이름를 입력해주세요 : ");
        String name = sc.next();
        model.setUserName(name);

        System.out.printf("주민번호를 입력해주세요 : ");
        String personId = sc.next();
        model.setPersonNumber(personId);

        System.out.printf("전화번호를 입력해주세요 : ");
        String phoneNumber = sc.next();
        model.setPhoneNumber(phoneNumber);

        System.out.printf("주소를 입력해주세요 : ");
        String address = sc.next();
        model.setAddress(address);

        System.out.printf("직업을 입력해주세요 : ");
        String job = sc.next();
        model.setJob(job);

        System.out.println("ID : " + model.getUserID());
        System.out.println("비 번 : " + model.getPassWord());
        System.out.println("비번확인 : " + model.getPassWordAgain());
        System.out.println("이 름 : " + model.getUserName());
        System.out.println("주민번호 : " + model.getPersonNumber());
        System.out.println("전화번호 : " + model.getPhoneNumber());
        System.out.println("주 소 : " + model.getAddress());
        System.out.println("직업 : " + model.getJob());

    }
}