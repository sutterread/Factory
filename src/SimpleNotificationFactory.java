
public class SimpleNotificationFactory {

    public Notification createNotification(String type) {
        Notification notification = null;

        if (type.equals("email")) {
            notification = new EmailNotification();
        } else if (type.equals("sms")) {
            notification = new SMSNotification();
        } else if (type.equals("whatsapp")) {
            notification = new WhatsAppNotification();
        }
        return notification;
    }
}