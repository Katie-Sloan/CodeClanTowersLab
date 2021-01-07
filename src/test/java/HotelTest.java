import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void setUp(){
        hotel = new Hotel();
    }

    @Test
    public void hotelBedroomsStartsEmpty(){
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void hotelConferenceRoomsStartsEmpty(){
        assertEquals(0, hotel.conferenceRoomCount());
    }
}
