import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Room room;
    Guest guest;



    @Before
    public void before (){
        this.hotel = new Hotel ();
        this.room = new Bedroom (BedroomType.SINGLE,201, 50.00);
        this.guest = new Guest ("Hannah");
    }

    @Test
    public void canGetRoomList(){
        hotel.addRooms(room);
        hotel.addRooms(room);
        assertEquals(2, hotel.getRoomList().size());

    }

    @Test
    public void canCheckInGuests() {
        hotel.checkInGuest(room, guest);
        hotel.checkInGuest(room, guest);
        assertEquals(2, room.guests().size());
    }

    @Test
    public void canCheckGuestsInRoom() {
        hotel.checkInGuest(room, guest);
        hotel.checkInGuest(room, guest);
        assertEquals(2, hotel.guestsInRoom(room).size());
    }

    @Test
    public void canCheckOutGuests(){
        hotel.checkInGuest(room, guest);
        hotel.checkInGuest(room, guest);
        hotel.checkOutGuests(room, guest);
        assertEquals(1, room.guests().size());

    }

    @Test
    public void canAddRooms(){
        hotel.addRooms(room);
        assertEquals(1, hotel.getRoomList().size());
    }



}
