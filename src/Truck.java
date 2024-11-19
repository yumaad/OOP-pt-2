public class Truck extends VehicleBase {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовике " + modelName);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика " + modelName);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика " + modelName);
    }
}
