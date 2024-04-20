public class ConcreteVehicleFactory extends VehicleFactory {
    @Override
    public IFactory GetVehicle(String vehicle) {
        switch (vehicle) {
            case "Scooter":
                return new Scooter();
            case "Bike":
                return new Bike();
            default:
                throw new RuntimeException("Vehicle " + vehicle + " cannot be created");
        }
    }
}
