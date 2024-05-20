public class PhoneLockState implements PhoneState{
    @Override
    public void open(Phone phone) {
        System.out.println("Phone is unlocked.");
        phone.setState(new PhoneOpenState());
    }

    @Override
    public void lock(Phone phone) {
        System.out.println("Phone is already locked.");
    }

    @Override
    public void close(Phone phone) {
        System.out.println("Phone is closing.");
        phone.setState(new PhoneCloseState());
    }
}
