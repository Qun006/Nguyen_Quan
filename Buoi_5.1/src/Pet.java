public class Pet {
    private final int overWeight = 10;
    private String name;
    private double weight;
    private String species;

    public Pet (String name, double weight, String species){
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    public Pet(){

    }

    public void printInfo(){
        System.out.print("\n " + this.name + " thuộc loài " + this.species + " và nó nặng " + this.weight + " cân");
    }
    public boolean isOverweight(){
        if(this.weight > overWeight){
            return true;
        }
        else{
            return false;
        }
    }

    public String getBasicInfo(){
        return this.name + " là loài " + this.species;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
