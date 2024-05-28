package hotel.roomfactory.rooms;

public class SingleRoom extends Room {
    public SingleRoom(int capacidad, String roomID, String status) {
        super(capacidad, roomID, status);
    }

    @Override
    public void descripcion() {
        System.out.println("Cuarto pequeño con una cama.");
    }

    @Override
    public void funcionalidad() {
        System.out.println("No mucho, solo acostate.");
    }
}
