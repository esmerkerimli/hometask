public class Main {
    public static void main(String[] args) {

        Human mother = new Human("Gozel", "Kerimova", 1981);
        Human father = new Human("Agasef", "Kerimov", 1966);

        Family family = new Family(mother, father);

        Human child = new Human("Asmar", "Karimli", 2006, 140, new String[][]{{"Monday", "Play guitar"}, {"Tuesday", "Do laundry"}});
        family.addChild(child);

        Pet pet = new Pet("Cat", "Puffy", 3, 80, new String[]{"barking", "running", "playing"});
        family.setPet(pet);

        System.out.println(family);

        pet.eat();
        pet.respond();
        pet.foul();

        family.deleteChild(0);

        System.out.println("After removing child:");
        System.out.println(family);

        System.out.println("Total family members: " + family.countFamily());
    }
}
