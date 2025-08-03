package bai_3;

public class Car {
    private String brand;
    private int maxSpeed;
    final int maxSpeed1 = 90;

    public Car(String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    public String getBrand (){
        return this.brand;
    }
    public void setBrand (String brand){
        this.brand = brand;
    }
    public int getMaxSpeed (){
        return this.maxSpeed;
    }
    public void setMaxSpeed (int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void run (){
        System.out.println("Xe " + brand + " đang chạy với tốc độ tối đa " + maxSpeed + " km\\h");
    }
    public void test(){
        if(maxSpeed<=maxSpeed1){
            System.out.println("Xe " + brand + " có tốc độ tối đa không vượt mức cho phép.");
        }
        else{
            System.out.println("Xe " + brand + " có tốc độ tối đa vượt mức cho phép.");
        }
    }
}
