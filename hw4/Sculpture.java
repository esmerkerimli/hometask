class Sculpture extends Art {
    public Sculpture(String tool) {
        super(tool);
    }

    //overriding abstract method
    @Override
    public void creation() {
        System.out.println("Sculpture can be created using " + tool);
    }

    //I did not override the displayMessage method which means it will show the initial output

    //concrete method which only belongs to Sculpture
    public void carving() {
        System.out.println("Sculpture calls for carving.");
    }
}
