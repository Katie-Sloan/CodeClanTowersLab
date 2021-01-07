import com.sun.tools.jdi.ConcreteMethodImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void setUp(){
        conferenceRoom = new ConferenceRoom("Winter", 10);
    }

    @Test
    public void canGetConferenceRoomName(){
        assertEquals("Winter", conferenceRoom.getConferenceRoomName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void conferenceRoomStartsEmpty(){
        assertEquals(0, conferenceRoom.guestCount());
    }
}
