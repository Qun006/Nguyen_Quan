import bai_1.Student;
import bai_2.Student_one;
import bai_3.Car;
public class Main {
    public static void main(String[] args) {
        Student A = new Student();
        A.name1 = "Qun";
        A.age1 = 19;
        A.sayHello();
        Student_one B = new Student_one("han",21);
        B.sayHello();
        B.setName("Tuan");
        B.sayHello();
        B.setAge(20);
        B.sayHello();
        Car C = new Car("Yamaha", 300);
        C.run();
        C.setBrand("BMW");
        C.setMaxSpeed(200);
        C.run();
        C.test();
    }
}