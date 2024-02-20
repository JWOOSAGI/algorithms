package kaupOOP;

import java.util.Scanner;

public class Person {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;

    /*public void setName(String name){
        this.name = name;
    }*/
    public String getName(){
        return this.name;
    }
    public void createName(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("이름 입력 : ");
        String name = sc.next();
        this.name = name;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    /*public void createHeight(){
        this.height = (Math.random()*50)+150;
    }*/
    /*public void setWeight(double weight){
        this.weight = weight;
    }*/
    public double getWeight(){
        return this.weight;
    }
    public void createWeight(){
        this.weight = (Math.random()*69)+30;
    }
    public double getBmi() {
        return this.bmi;
    }
    public void createBMI(){
        this.bmi = weight / ((height*0.01)*(height*0.01));
    }
    public String getBodyMass() {
        return this.bodyMass;
    }
    public void createBodyMass() {
        String bodyMass = "";
        if (bmi < 18.5){
            bodyMass = "저체중";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            bodyMass = "정상";
        } else if (bmi >=23 && bmi <=24.9) {
            bodyMass = "과체중";
        } else if (bmi >=25 && bmi <=29.9) {
            bodyMass = "비만";
        } else if (bmi >=30) {
            bodyMass = "고도비만";
        }
        this.bodyMass = bodyMass;
    }
}
