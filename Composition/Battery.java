class Battery {
    private double capacity;
    private String type;

    public Battery(double capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return capacity + " mAh " + type + " Battery";
    }
}