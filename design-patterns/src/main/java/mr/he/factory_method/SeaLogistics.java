package mr.he.factory_method;

public class SeaLogistics implements Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }

}
