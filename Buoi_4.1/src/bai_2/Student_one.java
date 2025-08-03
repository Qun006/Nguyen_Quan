package bai_2;

public class Student_one {
    private String name;
    private int age;
    public Student_one (String name, int age){
        this.age = age;
        this.name = name;
    }
    public String getName (){
        return this.name;
    }
    public void setName (String name){
        this.name = name;
    }
    public int getAge (){
        return this.age;
    }
    public void setAge (int age){
        this.age = age;
    }
    public void sayHello (){
        System.out.println("\n Xin chào, tên tôi là " + name + ", năm nay tôi " + age + " tuổi");
    }
}
