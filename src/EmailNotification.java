
public class EmailNotification extends Notification {

    @Override
    public void send() {

        System.out.println("Sending email to " + recipient + ": " + message);
    }

    @Override
    protected String getChannel() {

        return "Email";
    }
}