public class Main {
    public static void main(String[] args) {
        Hotel myHotel = new Hotel("Radisson Hotel", "1 Azadlıq Prospekti", 100, 20, 4.5);

        myHotel.displayDetails();

        if (myHotel.isRecommended()) {
            System.out.println("This hotel is highly recommended!");
        } else {
            System.out.println("This hotel is not highly recommended.");
        }

        if (myHotel.isFull()) {
            System.out.println("The hotel is fully booked.");
        } else {
            System.out.println("The hotel has available rooms.");
        }
    }
}


