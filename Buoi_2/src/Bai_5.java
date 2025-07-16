public class Bai_5 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.print("\n 5 x " + i + " = " + (5*i));
        }
        int tong = 0;
        for(int i=1; i<=100; i++) {
            if(i%2==0){
                tong+=i;
            }
        }
        System.out.print("\n Tổng các số chẵn dùng for là: " + tong);
        tong = 0;
        int i=1;
        while(i<=100){
            if(i%2==0){
                tong+=i;
            }
            i++;
        }
        System.out.print("\n Tổng các số chẵn dùng while là: " + tong);
    }
}
