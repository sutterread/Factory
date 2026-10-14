
public class NotificationService {

    private SimpleNotificationFactory factory;

    public NotificationService(SimpleNotificationFactory factory) {

        this.factory = factory;
    }

    public Notification sendNotification(String type, String recipient, String message) {
        Notification notification;

        notification = factory.createNotification(type);

        if (notification == null) {
            System.out.println("Unsupported notification type: " + type);
            return null;
        }

        notification.prepare(recipient, message);
        notification.send();
        notification.log();
        return notification;
    }
}