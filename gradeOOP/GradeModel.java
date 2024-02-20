package gradeOOP;

public class GradeModel {
    private String userName;
    private int kor;
    private int eng;
    private int math;
    private int avg;

    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public int getKor(){
        return this.kor;
    }
    public void setKor(int kor){
        this.kor=kor;
    }
    public int getEng(){
        return this.eng;
    }
    public void setEng(int eng){
        this.eng = eng;
    }
    public int getMath(){
        return this.math;
    }
    public void setMath(int math){
        this.math=math;
    }
    public int getAvg(){
        return this.avg;
    }
    public void setAvg(int avg){
        this.avg=avg;
    }
}
