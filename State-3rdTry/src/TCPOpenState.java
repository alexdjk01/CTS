public class TCPOpenState implements TCPState{
    @Override
    public void open(TCPConnection connection) {
        System.out.println("Open->Open");
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Open->Closed");
        connection.setState(new TCPClosedState());
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("Acknowledging data in process!");
    }
}
