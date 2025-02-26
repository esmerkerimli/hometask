class Painting extends Art {
    public Painting(String medium) {
        super(medium);
    }

    //overriding abstract method
    @Override
    public void creation(){
        System.out.println("Paintings can be created using " + tool);
    }

    //overriding the concrete method to change the output
    @Override
    public void displayMessage() {
        System.out.println("Welcome to the Art Club's organization.");
    }

    //concrete method which only belongs to Painting
    public void colors() {
        System.out.println("Paintings call for colors.");
    }
}