import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Harris", 100, 00.00);
    }

    @Test
    public void getDiningRoomCapacity(){
        assertEquals(150, diningRoom.getCapacity() );
    }

    @Test
    public void getDiningRoomName(){
       assertEquals("Harris", diningRoom.getRoomName());
    }

    @Test
    public void getDiningRoomRate(){
        assertEquals(00.00, diningRoom.getRate(), 0.01);
    }

    @Test
    public void getDiningRoomNumber(){
        assertEquals(100, diningRoom.getroomNumber());
    }
}
