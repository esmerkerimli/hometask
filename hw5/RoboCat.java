public class RoboCat extends Pet {
    public RoboCat() {
        super();
        this.species = Species.ROBO_CAT;

        @Override
        public void respond() {
            System.out.println("The robot cat makes mechanical sounds.");
        }
    }