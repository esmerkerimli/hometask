public class Dog extends Pet{
    public Dog(){
        super();
        this.species = Species.DOG;
    }
    @Override
    public void respond(){
        System.out.println("Hav hav");
    }

    public void foul(){
        System.out.println("Barks loudly");
    }
}
