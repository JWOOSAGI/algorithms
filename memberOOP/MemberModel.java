package memberOOP;

import java.util.Scanner;

public class MemberModel {
    private String userID;
    private String passWord;
    private String passWordAgain;
    private String userName;
    private String personNumber;
    private String phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;
    //Kauf지수에서 사용하는 생성자
    public MemberModel(double height, double weight){
        this.weight = weight;
        this.height = height;
    }

    //회원가입에서 사용하는 생성자
    public MemberModel(String userID,String passWord,String passWordAgain,String userName,
                       String personNumber,String phoneNumber,String address,
                       String job){
        this.userID = userID;
        this.passWord = passWord;
        this.passWordAgain = passWordAgain;
        this.userName = userName;
        this.personNumber = personNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }

    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWordAgain() {
        return this.passWordAgain;
    }

    public void setPassWordAgain(String passWordAgain) {
        this.passWordAgain = passWordAgain;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPersonNumber() { return this.personNumber; }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

//    @Override
//    public String toString() {
//        return "MemberModel{" +
//                "userID='" + userID + '\'' +
//                ", passWord='" + passWord + '\'' +
//                ", passWordAgain='" + passWordAgain + '\'' +
//                ", userName='" + userName + '\'' +
//                ", personNumber='" + personNumber + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", address='" + address + '\'' +
//                ", job='" + job + '\'' +
//                '}';
//    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MemberModel{" +
                "userID='" + userID + '\'' +
                ", passWord='" + passWord + '\'' +
                ", passWordAgain='" + passWordAgain + '\'' +
                ", userName='" + userName + '\'' +
                ", personNumber='" + personNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
//                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
//                ", bmi=" + bmi +
//                ", bodyMass='" + bodyMass + '\'' +
                '}';
    }
}
