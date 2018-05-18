public abstract class Room {

    private Integer roomNumber;
    private Double rate;
    private Integer capacity;
    private String type;


    public Room(Integer roomNumber, Double rate, Integer capacity, String type) {
        this.roomNumber = roomNumber;
        this.rate = rate;
        this.capacity = capacity;
        this.type = type;
    }

    public Integer getRoomNumber() {
        return this.roomNumber;
    }

    public Double getRate() {
        return this.rate;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public String getType(){
        return this.type;
    }
}