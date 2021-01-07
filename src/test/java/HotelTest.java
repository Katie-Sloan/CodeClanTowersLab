import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Guest guest;
    Guest guest2;
    Guest guest3;

    @Before
    public void setUp(){
        hotel = new Hotel();
        bedroom = new Bedroom(1, 2, RoomType.DOUBLE);
        guest = new Guest("John");
        guest2 = new Guest("Zsolt");
        guest3 = new Guest("Roosa");
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

    @Test
    public void cannotCheckInGuest(){
        hotel.addRoom(bedroom);
        hotel.checkInGuest(guest, bedroom);
        hotel.checkInGuest(guest2, bedroom);
        hotel.checkInGuest(guest3, bedroom);
        assertEquals(2, bedroom.guestCount());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.addRoom(bedroom);
        hotel.checkInGuest(guest, bedroom);
        hotel.checkOutGuest(guest, bedroom);
        assertEquals(0, bedroom.guestCount());
    }
}
