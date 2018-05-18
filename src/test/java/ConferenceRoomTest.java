import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Iona", 200, 300.00);
    }

    @Test
    public void getConferenceRoomCapacity(){
        assertEquals(200, conferenceRoom.getCapacity());
    }

    @Test
    public void getConferenceRoomName(){
        assertEquals("Iona", conferenceRoom.getRoomName());
    }

    @Test
    public void getConferenceRoomRate(){
        assertEquals(300.00, conferenceRoom.getRate(), 0.01);
    }

    @Test
    public void getConferenceRoomNumber(){
        assertEquals(200, conferenceRoom.getroomNumber());
    }
}
