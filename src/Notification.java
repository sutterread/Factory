
public abstract class Notification {

    protected String recipient;
    protected String message;

    public void prepare(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
        System.out.println("Preparing " + getChannel() + " for " + recipient + "...");
    }

    public void log() {

        System.out.println("[LOG] " + getChannel() + " sent to " + recipient);
    }


    public abstract void send();

    protected abstract String getChannel();
}