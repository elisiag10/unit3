
public class Event {

    // two public final static fields
    public final int PRICE_PER_GUEST = 35;
    public final int CUT_OFF_VALUE = 50;
    // three private fields
    private static String eventNumber;
    private static int numberOfGuests;
    private int price;

    // two public set methods
    public void setEventNumber(String x) {
        eventNumber = x;
    }

    public void setGuests(int x) {
        numberOfGuests = x;
        price = numberOfGuests * PRICE_PER_GUEST;
    }

    // three public get methods

    public String getEventNumber() {
        return eventNumber;
    }

    public int getNumberOfGuest() {
        return numberOfGuests;
    }

    public int getPrice() {
        return price;
    }
}
