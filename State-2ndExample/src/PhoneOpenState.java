public class PhoneOpenState implements  PhoneState{
    @Override
    public void open(Phone phone) {
        System.out.println("Phone is already open.");
    }

    @Override
    public void lock(Phone phone) {
        System.out.println("Locking phone");
        phone.setState(new PhoneLockState());
    }

    @Override
    public void close(Phone phone) {
        System.out.println("Closing phone");
        phone.setState(new PhoneCloseState());
    }
}
