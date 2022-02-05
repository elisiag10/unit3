import java.util.Scanner;

public class EventDemo {

    public static void main(String[] args) {
        Event event = new Event();
        event.setEventNumber(inputEventNumber());
        event.setGuests(getGuest());
        Main.displayBanner();
        displayPrice(event.getEventNumber(), event.getNumberOfGuest(), event.getPrice(), event.PRICE_PER_GUEST,
                event.CUT_OFF_VALUE);
        Event event1 = new Event();
        Event event2 = new Event("A001", 5);

    }

    public static String inputEventNumber() {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter event number: ");
        String eventNumber = myObj.nextLine(); // Read user input
        // getRandomNumber();
        return eventNumber;
    }

    public static int getGuest() {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter number of guests: ");
        int numberOfGuests = myObj.nextInt(); // Read user input
        // getRandomNumber();
        return numberOfGuests;
    }

    public static void displayPrice(String eventNumber, int getNumberOfGuest, int getPrice, int pricePerGuest,
            int cutOffVal) {
        System.out.println("Event number " + eventNumber);
        System.out.println("Number of guests: " + getNumberOfGuest);
        System.out.println("The price per guests: " + pricePerGuest);
        System.out.println("Final price: " + getPrice);
        System.out.println("Large event: " + (getNumberOfGuest > cutOffVal));

    }

}
