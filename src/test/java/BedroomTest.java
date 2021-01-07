import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void setUp(){
        bedroom = new Bedroom(1, 2, RoomType.DOUBLE);
        guest = new Guest("John");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void bedroomStartsEmpty(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void addGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void removeGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.guestCount());
    }
}
