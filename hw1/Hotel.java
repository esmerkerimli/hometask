/*
 *        +---------------------------------+
 *        |             Hotel               |
 *        +---------------------------------+
 *        | - name: String                  |
 *        | - location: String              |
 *        | - totalRooms: int               |
 *        | - availableRooms: int           |
 *        | - rating: double                |
 *        +---------------------------------+
 *        | + displayDetails(): void        |
 *        | + isRecommended(): boolean      |
 *        | + isFull(): boolean             |
 *        +---------------------------------+
 */



public class Hotel {
    private String name;
    private String location;
    private int totalRooms;
    private int availableRooms;
    private double rating;

    public Hotel(String name, String location, int totalRooms, int availableRooms, double rating) {
        this.name = name;
        this.location = location;
        this.totalRooms = totalRooms;
        this.availableRooms = availableRooms;
        this.rating = rating;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Total Rooms: " + totalRooms);
        System.out.println("Available Rooms: " + availableRooms);
        System.out.println("Rating: " + rating + " stars");
    }

    public boolean isRecommended() {
        return rating >= 4;
    }

    public boolean isFull() {
        return availableRooms == 0;
    }
}