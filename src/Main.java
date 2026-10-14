
public class Main {
    public static void main(String[] args) {
        SimpleNotificationFactory factory = new SimpleNotificationFactory();
        NotificationService service = new NotificationService(factory);

        service.sendNotification("email", "sergio@mail.com", "Your order has been confirmed");
        System.out.println();
        service.sendNotification("sms", "3001234567", "Your code is 4821");
        System.out.println();
        service.sendNotification("whatsapp", "3109876543", "Your order is on its way");
        System.out.println();
        service.sendNotification("telegram", "user", "Hello");
    }
}