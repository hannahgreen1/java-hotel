public class Bedroom extends Room {

private BedroomType type;
private int roomNumber;
private Double roomRate;

    public Bedroom(BedroomType type, int roomNumber, Double roomRate){
        super(2);
        this.type = type;
        this.roomNumber = roomNumber;
        this.roomRate = roomRate;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Double getRate() {
        return roomRate;
    }

    public BedroomType getRoomType() {
        return type;
    }
}


