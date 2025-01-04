import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingSystemTest {

    @org.junit.jupiter.api.Test
    void isAvailable() {
        //Arrange
        BookingSystem bookingSystem = new BookingSystem();

        Room room = new Room("Room1", 10);
        User user = new User("David");

        bookingSystem.book(
                room,
                LocalDateTime.of(24, 12, 19, 14, 30),
                LocalDateTime.of(24, 12, 19, 17, 30),
                user);

        //Act
       boolean actual = bookingSystem.isAvailable(
                room,
                LocalDateTime.of(24, 12, 19, 14, 30),
                LocalDateTime.of(24, 12, 19, 17, 30));

       boolean expected = false;

       //Assert

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void findAvailable() {
    }

    @org.junit.jupiter.api.Test
    void book() {
    }
}