import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> allRooms;


    public Hotel() {
        this.allRooms = new ArrayList<>();
    }

    public void addRooms(Room room){
        this.allRooms.add(room);
    }

    public void checkInGuest(Room room, Guest guest){
        room.guests().add(guest);
    }


    public void checkOutGuests(Room room, Guest guest){
        room.guests().remove(guest);
    }

    public ArrayList<Room> getRoomList(){
        return this.allRooms;
    }

    public ArrayList<Guest> guestsInRoom(Room room){
        return room.guests();

    }
}
