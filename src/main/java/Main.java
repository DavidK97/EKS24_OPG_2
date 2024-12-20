import java.awt.print.Book;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //TODO Tilføj et ID til hver booking
    //TODO Eventuelt lav en TextUI
    //TODO Ryd op i Main

    public static void main (String [] args){
        List<Room> availableRooms;
        BookingSystem bookingSystem = new BookingSystem();

        User David = new User("David");
        User Dennis = new User("Dennis");
        Room room1 = new Room("Room 1", 15);
        Room room2 = new Room("Room 2", 8);
        Room room3 = new Room("Room 3", 20);

        bookingSystem.add(room1);
        bookingSystem.add(room2);
        bookingSystem.add(room3);

        //Add bookings
        System.out.println("Bookings confirmed: ");
        Booking book2 = (bookingSystem.book(room2, LocalDateTime.of(24, 12, 19, 14, 30),
                LocalDateTime.of(24, 12, 19, 17, 30), Dennis));
        System.out.println(book2);

        Booking book1 = (bookingSystem.book(room1, LocalDateTime.of(24, 12, 19, 14, 30),
                LocalDateTime.of(24, 12, 19, 17, 30), David));
        System.out.println(book1);

        System.out.println();

        //Is a room available?
        boolean room = bookingSystem.isAvailable(room1, LocalDateTime.of(24, 12, 19, 14, 30),
                LocalDateTime.of(24, 12, 19, 17, 30));
        if (room == true){
            System.out.println("Room is available");
        } else {
            System.out.println("Room is unavailable");
        }

        System.out.println();

        //Remove booking
        bookingSystem.cancel(book1);

        System.out.println();

        availableRooms = bookingSystem.findAvailable(10, LocalDateTime.of(24, 12, 19, 12, 0),
                LocalDateTime.of(24, 12, 19, 15, 0));
        System.out.println("Available rooms: " + availableRooms);




    }
}
