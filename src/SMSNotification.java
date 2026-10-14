
public class SMSNotification extends Notification {

    @Override
    public void send() {

        System.out.println("Sending SMS to number " + recipient + ": " + message);
    }

    @Override
    protected String getChannel() {

        return "SMS";
    }
}