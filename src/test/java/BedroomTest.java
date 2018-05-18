import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(BedroomType.DOUBLE, 101, 80.00);
    }

    @Test
    public void getBedroomCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void getBedroomRate(){
        assertEquals(80.00, bedroom.getRate(), 0.01);
    }

    @Test
    public void getBedroomNumber(){
        assertEquals(101, bedroom.getRoomNumber());
    }

    @Test
    public void getBedroomType(){
        assertEquals(BedroomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void getGuestsInRoom(){
        assertEquals(2, bedroom.getGuestsInRoom());
    }
}
