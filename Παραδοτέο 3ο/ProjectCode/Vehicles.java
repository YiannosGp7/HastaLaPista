public class Vehicles {
    private String vehicleType;

    public Vehicles(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Getters and Setters
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void viewVehicles() {
        System.out.println("Viewing vehicles of type: " + this.vehicleType);
    }
}
