package JavaPractice;

public class Animal {
    private static String name;
    private static String species;

    public Animal(String name, String species) {
         this.name = name;
         this.species = species;
    }

    public String roar() {
        return ("I am," + this.name + " hear me roar!");
    };

    public String getName() {
        return name;
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

    public static void main(String[] args) {
        Animal lion = new Animal("Leo", "Lionus maximus");
        System.out.println("lion.roar() = " + lion.roar());
    }
}
