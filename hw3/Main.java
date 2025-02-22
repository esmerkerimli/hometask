public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Gozel", "Kerimova", 1981, 130);
        Human father = new Human("Agasef", "Kerimov", 1966, 130);
        Family family = new Family(mother, father);

        Human child1 = new Human("Esmer", "Kerimli", 2006);
        Human child2 = new Human("Fazil", "Kerimli", 2003);
        family.addChild(child1);
        family.addChild(child2);

        Pet pet = new Pet(Species.BUNNY, "Pamuk", 3, 50, new String[]{"play ball", "jump"});
        family.setPet(pet);

        System.out.println(family);
        System.out.println("Family count: " + family.countFamily());

        String[][] schedule = {
                {DayOfWeek.MONDAY.name(), "Play piano"},
                {DayOfWeek.TUESDAY.name(), "Do laundry"},
                {DayOfWeek.WEDNESDAY.name(), "Attend volleyball practice"},
                {DayOfWeek.THURSDAY.name(), "Go shopping"},
                {DayOfWeek.FRIDAY.name(), "Visit grandparents"},
                {DayOfWeek.SATURDAY.name(), "Write essay"},
                {DayOfWeek.SUNDAY.name(), "Read books"}
        };

        child1.setSchedule(schedule);

        for (int i = 0; i < 10000; i++) {
            new Human("Test" + i, "User" + i, 2000 + i % 20);
        }

        System.gc();


        pet.eat();
        pet.respond();
        pet.foul();


        System.out.printf("Species of the Pet: %s%n", pet.getSpecies());
        System.out.printf("Is the pet capable of flying? %b%n", pet.getSpecies().canFly());
        System.out.printf("Total number of legs: %d%n", pet.getSpecies().getNumberOfLegs());
        System.out.printf("Does the pet have fur? %b%n", pet.getSpecies().hasFur());

    }
}
