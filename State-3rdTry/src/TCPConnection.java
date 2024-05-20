public class TCPConnection {
    private TCPState state;

    public TCPConnection()
    {
        this.state = new TCPClosedState(); //  the default one
    }

    public void setState(TCPState state)
    {
        this.state=state;
    }

    public void open()
    {
        state.open(this);
    }

    public void close()
    {
        state.close(this);
    }

    public void acknowledge()
    {
        state.acknowledge(this);
    }

}
