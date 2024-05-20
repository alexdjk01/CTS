public class TCPClosedState implements TCPState{
    @Override
    public void open(TCPConnection connection) {
        System.out.println("Closed->Open");
        connection.setState(new TCPOpenState());
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Closed->Closed");
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("CANNOT Acknowledge data!");
    }
}
