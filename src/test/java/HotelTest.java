import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Guest guest;

    @Before
    public void setUp(){
        hotel = new Hotel();
        bedroom = new Bedroom(1, 2, RoomType.DOUBLE);
        guest = new Guest("John");
    }

    @Test
    public void hotelBedroomsStartsEmpty(){
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void hotelConferenceRoomsStartsEmpty(){
        assertEquals(0, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckInGuest(){
        hotel.addRoom(bedroom);
        hotel.checkInGuest(guest, bedroom);
        assertEquals(1, bedroom.guestCount());
        assertEquals(1, hotel.bedroomCount());
    }
}
