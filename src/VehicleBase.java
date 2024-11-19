public abstract class VehicleBase implements Vehicle {
    protected String modelName;
    protected int wheelsCount;
    public VehicleBase(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    @Override
    public String getModelName() {
        return modelName;
    }
    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }
}

