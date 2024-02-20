package kaupTest;

public class KaupMain {
    //kaup지수 구하는 프로그램을 작성해주세요.
    public static void main(String[] args) {

        double height = (Math.random()*50)+150;
        double weight = (Math.random()*69)+30;
        String bmiResult = "";

        double bmi = weight / ((height*0.01)*(height*0.01));

        if (bmi < 18.5){
            bmiResult = "저체중";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            bmiResult = "정상";
        } else if (bmi >=23 && bmi <=24.9) {
            bmiResult = "과체중";
        } else if (bmi >=25 && bmi <=29.9) {
            bmiResult = "비만";
        } else if (bmi >=30) {
            bmiResult = "고도비만";
        }


        System.out.println("키 : " + (int)height + "cm");
        System.out.println("몸무게 : " + (int)weight + "kg");
        System.out.println("BMI : " + (int)bmi);
        System.out.println("비만도 : "+bmiResult);
    }
}
