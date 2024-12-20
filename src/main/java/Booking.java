import java.time.LocalDateTime;

public class Booking {
    private Room room;
    private User user;
    private LocalDateTime start;
    private LocalDateTime end;

    public Booking(Room room, LocalDateTime start, LocalDateTime end, User user){
        this.room = room;
        this.user = user;
        this.start = start;
        this.end = end;
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

    public String toString () {
        return "Name: " + getRoom().getName() + "| Booked from: " + getStart() + " to " + getEnd() + "| Booked by: " + getUser().getName();
    }

}
