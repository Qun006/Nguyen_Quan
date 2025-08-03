package bai_1;

public class Student {
    private String name;
    private int yearOfBirth;
    private String address;
    private double regularPoints1;
    private double regularPoints2;
    private double endPoint;
    private int numberOfBreaks;
    private double GPA;
    final int currentYear = 2025;

    public Student (String name, int yearOfBirth, String address, double regularPoints1, double regularPoints2, double endPoint, int numberOfBreaks){
        this.name = name;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
        this.regularPoints1 = regularPoints1;
        this.regularPoints2 = regularPoints2;
        this.endPoint = endPoint;
        this.numberOfBreaks = numberOfBreaks;
    }
    //  Name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    // Năm sinh
    public int getYearOfBirth (){
        return currentYear-yearOfBirth;
    }

    public void setYearOfBirth (int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    // Địa chỉ
    public String getAddress (){
        return address;
    }

    public void setAddress (String address){
        this.address = address;
    }
    // Điểm tx1
    public double getRegularPoints1 (){
        return regularPoints1;
    }

    public void setRegularPoints1 (double regularPoints1){
        this.regularPoints1 = regularPoints1;
    }
    // Điểm tx2
    public double getRegularPoints2 (){
        return regularPoints2;
    }

    public void setRegularPoints2 (double regularPoints2){
        this.regularPoints2 = regularPoints2;
    }
    // Điểm kết thúc học phần
    public double getEndPoint (){
        return endPoint;
    }

    public void setEndPoint (double endPoint){
        this.endPoint = endPoint;
    }
    // GPA
    public double getGPA (){
        return regularPoints1*0.2 + regularPoints2*0.3 + endPoint*0.5;
    }
    // Số tiết nghỉ
    public int getNumberOfBreaks (){
        return numberOfBreaks;
    }

    public void setNumberOfBreaks (int numberOfBreaks){
        this.numberOfBreaks = numberOfBreaks;
    }
}
