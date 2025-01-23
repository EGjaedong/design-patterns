package mr.he.factory_method;

public interface Logistics {

    public default void planDelivery() {
        System.out.println("Planning delivery...");
        Transport transport = createTransport();
        transport.deliver();
    }

    Transport createTransport();
}
