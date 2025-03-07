package org.example;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if(type == null || type.isEmpty()){
            return null;
        }
        switch(type){
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            case "PUSH":
                return new PushNotification();
            default:
                return null;
        }
    }
}