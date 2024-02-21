import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("첫번째 수 입력 : ");
        String first = sc.next();
        System.out.printf("두번째 수 입력 : ");
        String second = sc.next();
        System.out.println("+.-,*,/ 를 입력하세요.");
        String opcode = sc.next();
        int result = 0;
        int intNum1 = Integer.parseInt(first);
        int intNum2 = Integer.parseInt(second);

//        if (opcode.equals("+")) {
//            result = intNum1 + intNum2;
//        } else if (opcode.equals("-")) {
//            result = intNum1 - intNum2;
//        } else if (opcode.equals("*")) {
//            result = intNum1 * intNum2;
//        } else if (opcode.equals("/")) {
//            result = intNum1 / intNum2;
//        } else {
//            System.out.println("잘못된 연산기호 입니다.");
//            return;
//        }

        switch (opcode) {
            case "+":
                result = intNum1 + intNum2;
                break;
            case "-":
                result = intNum1 - intNum2;
                break;
            case "*":
                result = intNum1 * intNum2;
                break;
            case "/":
                result = intNum1 / intNum2;
                break;
            default:
                System.out.println("잘못된 연산자");
        }


        System.out.println("첫번째 수 : " + first);
        System.out.println("두번째 수 : " + second);
        System.out.println("결과 : " + result);

    }
}