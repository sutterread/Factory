
public class WhatsAppNotification extends Notification {

    @Override
    public void send() {

        System.out.println("Sending WhatsApp message to number " + recipient + ": " + message);
    }

    @Override
    protected String getChannel() {

        return "WhatsApp";
    }
}