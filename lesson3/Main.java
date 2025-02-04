public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("cat", "Lucy", 2, 54, new String[]{"meow", "eat", "sleep"});
        Human mother = new Human("Gozel", "Kerimova", 1981);
        Human father = new Human("Agasef", "Kerimov", 1966);
        Human human = new Human("Esmer", "Kerimli", 2006, 100, pet, mother , father);

        human.greetPet();
        human.describePet();
        pet.eat();
        pet.foul();
        pet.respond();
    }
}

