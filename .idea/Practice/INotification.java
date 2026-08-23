package Practice;

import java.util.*;

public class INotification {
    public static void main(String[] args) {
        String message = "This is a notification message.";
        
        Notification smsNotification = new SMSNotification();
        Notification emailNotification = new EmailNotification();
        Notification pushNotification = new PushNotification();

        List<Notification> notifications = new ArrayList<>();
        
        notifications.add(smsNotification);
        notifications.add(emailNotification);   
        notifications.add(pushNotification);

        for (Notification notification : notifications) {
            notification.sendNotification(message);
        }

    }
}

interface Notification {
    void sendNotification(String message);
}

class SMSNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email notification: " + message);
    }
}

class PushNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push notification: " + message);
    }
}
