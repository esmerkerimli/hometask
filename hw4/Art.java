abstract class Art {
    protected String tool;

    public Art(String tool) {
        this.tool = tool;
    }

    //abstract method
    public abstract void creation();

    //concrete methods
    public void start() {
        System.out.println("The art project is started.");
    }

    public void displayMessage() {
        System.out.println("Welcome to the Art Exhibition! Enjoy the masterpieces.");
    }
}