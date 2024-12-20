import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private List<Room> roomList;
    private List<Booking> bookingList;
    private List<Room> availableRooms;

    public BookingSystem() {
        this.bookingList = new ArrayList<>();
        this.roomList = new ArrayList<>();
    }

    //Method that returns true or false if a room is available or not
    public boolean isAvailable(Room room, LocalDateTime start, LocalDateTime end) {
        for (Booking booking : bookingList) {
            if (booking.getRoom().equals(room) && booking.getStart().isBefore(end) && booking.getEnd().isAfter(start)) {
                return false;
            }
        }
        return true;
    }


    //Method that returns a List of available rooms with a chosen min. capacity
    public List<Room> findAvailable(int capacity, LocalDateTime start, LocalDateTime end) {
        availableRooms = new ArrayList<>();
        for (Room room : roomList) {
            if (isAvailable(room, start, end) == true && room.getCapacity() >= capacity) {
                availableRooms.add(room);
            }
        } if (availableRooms.isEmpty()) {
            System.out.println("There are no available rooms");
        }
        return availableRooms;
    }


    //Method that books a room
    public Booking book (Room room, LocalDateTime start, LocalDateTime end, User user) {
       if (isAvailable(room, start, end) == true) {
           Booking booking = new Booking(room, start, end, user);
           bookingList.add(booking);
           user.addBooking(booking);
           return booking;
       } else {
           System.out.println("Booking failed");
           return null;
       }
    }

    //Method that cancels bookings
    public void cancel (Booking book){
        bookingList.remove(book);
        System.out.println("Booking cancelled: " + book.getRoom().getName());
    }

    public void add(Room room) {
        roomList.add(room);
    }



}
