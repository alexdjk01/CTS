public class Phone{

    private PhoneState currentState;

    public Phone()
    {
        currentState = new PhoneCloseState();
    }

    public void setState(PhoneState state)
    {
        currentState = state;
    }

    public void open()
    {
        currentState.open(this);
    }

    public void close()
    {
        currentState.close(this);
    }

    public void lock()
    {
        currentState.lock(this);
    }
}
