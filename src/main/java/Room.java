public abstract class Room {

    private Integer roomNumber;
    private Double rate;
    private Integer capacity;


    public Room(Integer roomNumber, Double rate, Integer capacity) {
        this.roomNumber = roomNumber;
        this.rate = rate;
        this.capacity = capacity;
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
}