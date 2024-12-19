import java.time.LocalDateTime;
public class Main {

    public static void main (String [] args){

        BookingSystem bookingSystem = new BookingSystem();

        User David = new User("David");
        Room room1 = new Room("Room 1", 15);

        bookingSystem.book(room1, LocalDateTime.of(24, 12, 19, 14, 30),
                LocalDateTime.of(24, 12, 19, 17, 30), David);



    }
}
