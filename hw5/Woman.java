public class Woman extends Human {
    public Woman(String name, String familyName, int iq) {
        super(name, familyName, iq);
    }

    @Override
    public void greetPet() {
        System.out.println("Hi, pet! I'm your owner.");
    }

    @Override
    public void uniqueMethod() {
        System.out.println("I enjoy dressing up.");
    }
}
