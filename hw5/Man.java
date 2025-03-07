public class Man extends Human {
    public Man(String name, String familyName, int iq) {
        super(name, familyName, iq);
    }

    @Override
    public void greetPet() {
        System.out.println("Hey there, buddy! Ready to play?");
    }

    @Override
    public void uniqueMethod() {
        System.out.println("I enjoy playing the piano.");
    }
}
