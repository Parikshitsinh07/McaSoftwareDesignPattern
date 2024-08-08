class MobilePhone {
    private String brand;
    private Battery battery; // Composition: MobilePhone has a Battery

    public MobilePhone(String brand, Battery battery) {
        this.brand = brand;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return brand + " Mobile Phone with " + battery;
    }
}