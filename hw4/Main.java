public class Main {
    public static void main(String[] args) {
        Painting painting = new Painting("oil paint");
        painting.start();
        painting.displayMessage();
        painting.creation();
        painting.colors();

        System.out.println();

        Sculpture sculpture = new Sculpture("marble");
        sculpture.start();
        sculpture.displayMessage();
        sculpture.creation();
        sculpture.carving();
    }
}