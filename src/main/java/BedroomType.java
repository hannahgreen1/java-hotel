public enum BedroomType {
    SINGLE(50),
    DOUBLE(80);

    private final int roomRate;

    BedroomType(int roomRate){
        this.roomRate = roomRate;
    }

    public int getRoomRate() {
        return roomRate;
    }
    }

