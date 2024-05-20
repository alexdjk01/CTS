public class PhoneCloseState implements  PhoneState{
    @Override
    public void open(Phone phone) {
        System.out.println("Opening phone.");
        phone.setState(new PhoneOpenState());
    }

    @Override
    public void lock(Phone phone) {
        System.out.println("The phone is closed, cannot be locked");
    }

    @Override
    public void close(Phone phone) {
        System.out.println("Phone is already closed.");
    }
}
