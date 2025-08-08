import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets_one = new ArrayList<>();
        ArrayList<Pet> pets_two = new ArrayList<>();
        Cage one = new Cage("01",new ArrayList<Pet>(), 0);
        Cage two = new Cage("02", new ArrayList<Pet>(), 0);
        System.out.print("\n Nhập thông tin thú trong lồng 1 là: ");
        one.addPet(pets_one);
        System.out.print("\n Nhập thông tin thú trong lồng 2 là: ");
        two.addPet(pets_two);
        System.out.print("\n Số lồng đã tạo là: " + Cage.getTotalCages());
        System.out.print("\n Danh sách thứ trong lồng 1 là: "); one.printAllPets(pets_one);
        System.out.print("\n Danh sách thứ trong lồng 2 là: "); two.printAllPets(pets_two);
        System.out.print("\n Danh sách thú nặng hơn 10 cân là: ");
        for(Pet petWeight : pets_one){
            if(petWeight.isOverweight()){
                System.out.print(petWeight.getName() + ",");
            }
            else{
                continue;
            }
        }
        for(Pet petWeight : pets_two){
            if(petWeight.isOverweight()){
                System.out.print(petWeight.getName());
            }
            else{
                continue;
            }
        }
    }
}