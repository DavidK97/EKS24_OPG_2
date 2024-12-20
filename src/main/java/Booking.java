import java.time.LocalDateTime;

public class Booking {
    private Room room;
    private User user;
    private LocalDateTime start;
    private LocalDateTime end;
    private static int bookingId = 0;

    public Booking(Room room, LocalDateTime start, LocalDateTime end, User user){
        this.room = room;
        this.user = user;
        this.start = start;
        this.end = end;
        bookingId++;
    }

    public Room getRoom (){
        return room;
    }

    public LocalDateTime getStart () {
        return start;
    }

    public LocalDateTime getEnd () {
        return end;
    }

    public User getUser () {
        return user;
    }

    public int getBookingId () {
        return bookingId;
    }

    public String toString () {
        return "Booking id: " + getBookingId() + "| Name: " + getRoom().getName() + "| Booked from: " + getStart() + " to " + getEnd() + "| Booked by: " + getUser().getName();
    }

}
