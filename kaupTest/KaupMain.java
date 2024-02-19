package kaupTest;

public class KaupMain {
    //kaup지수 구하는 프로그램을 작성해주세요.
    public static void main(String[] args) {

        double height = (Math.random()*50)+150;
        double weight = (Math.random()*69)+30;

        double bmi = weight / ((height*0.01)*(height*0.01));

        System.out.println("키: " + height + "cm");
        System.out.println("몸무게: " + weight + "kg");
        System.out.println("BMI: " + bmi);
    }
}