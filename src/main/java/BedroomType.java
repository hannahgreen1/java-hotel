public enum BedroomType {
    SINGLE(50),
    DOUBLE(80);

    private final int rate;

    BedroomType(int rate){
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
    }

