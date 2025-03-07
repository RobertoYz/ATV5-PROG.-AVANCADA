package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");

        int choice = scanner.nextInt();
        scanner.nextLine();

        String type = "";
        switch (choice) {
            case 1:
                type = "EMAIL";
                break;
            case 2:
                type = "SMS";
                break;
            case 3:
                type = "PUSH";
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Digite a mensagem a ser enviada:");
        String message = scanner.nextLine();

        Notification notification = NotificationFactory.createNotification(type);

        if (notification != null){
            notification.send(message);
        } else{
            System.out.println("Erro ao criar a notificação.");
        }
        scanner.close();
    }
}