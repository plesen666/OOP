public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (Vehicle instanceof Car) {
            test(vehicle);
            final Car car = (Car) vehicle;
            car.checkEngine();

        } else if (vehicle instanceof Truck) {
            test(vehicle);
            final Truck truck = (Truck) vehicle;


            truck.checkEngine();
            truck.checkTrailer();
        } else if (vehicle instanceof Bicycle) {
            test(vehicle);
        }
    }
}

public void test(Vehicle vehicle) {
    System.out.println("Обслуживаем " + vehicle.getModelName();
    for (int i = 0; i < vehicle.getWheelsCount(); i++) {
        vehicle.updateTyre();
    }


}


