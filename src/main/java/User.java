import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List <Booking> bookings;

    public User (String name){
        this.name = name;
        this.bookings = new ArrayList<>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public void removeBooking(Booking booking) {
        bookings.remove(booking);
    }

    public String getName () {
        return name;
    }

    public List <Booking> getBookings () {
        return bookings;
    }
}
