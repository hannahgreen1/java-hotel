public class DiningRoom extends Room {

    private String roomName;
    private int roomNumber;
    private Double roomRate;


    public DiningRoom(String roomName, int roomNumber, Double roomRate){
        super(150);
        this.roomName = roomName;
        this.roomNumber = roomNumber;
        this.roomRate = roomRate;

    }

    public String getRoomName(){
        return roomName;
    }

    public int getroomNumber(){
        return roomNumber;
    }

    public Double getRate() {
        return roomRate;
    }

}
