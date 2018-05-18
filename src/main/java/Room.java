import java.util.ArrayList;

public abstract class Room {


    private ArrayList<Guest> guests;
    private int capacity;

    public Room(int capacity) {
        this.guests =  new ArrayList<>();
        this.capacity = capacity;
    }

    public int getGuestsInRoom(){
        return this.guests.size();
    }

    public ArrayList<Guest> guests() {
        return this.guests;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

}