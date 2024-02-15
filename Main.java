import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);
        System.out.printf("ID?");
        String ID = scanner.next();
        System.out.printf("비번?");
        String PW = scanner.next();
        System.out.printf("비번확인?");
        String PWC = scanner.next();
        System.out.printf("이름?");
        String name = scanner.next();
        System.out.printf("주민번호?");
        String number = scanner.next();
        System.out.printf("전화번호?");
        String phone = scanner.next();
        System.out.printf("주소?");
        String address = scanner.next();
        System.out.println("ID : " + ID);
        System.out.println("PW : " + PW);
        System.out.println("PWC : " + PWC);
        System.out.println("name : " + name);
        System.out.println("number : " + number);
        System.out.println("phone : " + phone);
        System.out.println("address : " + address);

    }
}
/*Scanner scanner = new Scanner(System.in);
        System.out.printf("이름?");
String name = scanner.next();
        System.out.printf("나이?");
String age = scanner.next();
        System.out.println(name);
        System.out.printf(age);*/
