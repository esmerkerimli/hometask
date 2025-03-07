public class Dog extends Pet implements Foulable {
    public Dog() {
        super();
        this.species = Species.DOG;
    }

    @Override
    public void respond() {
        System.out.println("The dog barks.");
    }

    @Override
    public void foul() {
        System.out.println("The dog digs a hole.");
    }
}