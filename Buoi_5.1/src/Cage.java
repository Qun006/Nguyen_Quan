import java.util.ArrayList;
import java.util.Scanner;

public class Cage {
    private String cageCode;
    private ArrayList<Pet> pets;
    private int currentPetCount;
    private static int totalCages = 0;
    private final int MAX_CAPACITY = 3;

    public Cage(String cageCode, ArrayList<Pet> pet, int currentPetCount){
        this.cageCode = cageCode;
        this.pets = pets;
        this.currentPetCount = currentPetCount;
        this.totalCages++;
    }

    public void addPet(ArrayList<Pet> pets){
        Scanner add = new Scanner(System.in);
        do {
            System.out.print("\n Nhập tên mới: ");
            String name = add.nextLine();
            System.out.print("\n Nhập cân nặng mới: ");
            double weight = add.nextDouble(); add.nextLine();
            System.out.print("\n Nhập loài mới: ");
            String species = add.nextLine();
            pets.add(new Pet(name, weight, species));
            System.out.print("\n Đã cho thêm thú vào lồng.");
            currentPetCount++;
            if(currentPetCount<MAX_CAPACITY){
                System.out.print("\n Hãy cho thêm thú mới vào lồng.");
            }
            else{
                System.out.print("\n Lồng đã đầy.");
            }
        }
        while(currentPetCount<MAX_CAPACITY);
    }

    public void printAllPets(ArrayList<Pet> pets){
        System.out.println();
        for(Pet pet : pets){
            System.out.println(pet.getBasicInfo());
        }
    }

    public static int getTotalCages() {
        return totalCages;
    }

    public static void setTotalCages(int totalCages) {
        Cage.totalCages = totalCages;
    }
}
