import java.time.LocalDateTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BookingSystem bookingSystem = new BookingSystem();

        //Create users
        User user1 = new User("David");
        User user2 = new User("Dennis");

        //Create rooms
        Room room1 = new Room("Room 1", 15);
        Room room2 = new Room("Room 2", 8);
        Room room3 = new Room("Room 3", 20);
        Room room4 = new Room("Room 4", 10);
        Room room5 = new Room("Room 5", 5);

        //Add rooms
        bookingSystem.addRoom(room1);
        bookingSystem.addRoom(room2);
        bookingSystem.addRoom(room3);
        bookingSystem.addRoom(room4);
        bookingSystem.addRoom(room5);


        System.out.println("-----------Add bookings-----------------");
        //Add bookings
        Booking book1 = (bookingSystem.book(
                room1,
                LocalDateTime.of(24, 12, 19, 14, 30),
                LocalDateTime.of(24, 12, 19, 17, 30), user1));
        System.out.println(book1);

        Booking book2 = (bookingSystem.book(
                room2,
                LocalDateTime.of(24, 12, 19, 14, 30),
                LocalDateTime.of(24, 12, 19, 17, 30), user2));
        System.out.println(book2);


        System.out.println("-------------Attempt to book room1 before book1---------------");
        //Is a room available?
        boolean room = bookingSystem.isAvailable(
                room1,
                LocalDateTime.of(24, 12, 19, 10, 30),
                LocalDateTime.of(24, 12, 19, 15, 30));
        if (room == true) {
            System.out.println("Room is available");
        } else {
            System.out.println("Room is unavailable");
        }

        System.out.println("------------Removal of booking 1----------------");
        //Remove booking
        bookingSystem.cancel(book1, user1);


        System.out.println("-----------List of available rooms-----------------");
        //Show list of available rooms
        List<Room> availableRooms = bookingSystem.findAvailable(
                8,
                LocalDateTime.of(24, 12, 19, 12, 0),
                LocalDateTime.of(24, 12, 19, 15, 0));
        for (Room r : availableRooms) {
            System.out.println(r);
        }
    }
}