package mr.he.factory_method;

public class RoadLogistics implements Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }

}
