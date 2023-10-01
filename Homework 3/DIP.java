package Homework3;
/*
Принцип инверсии зависимостей (Dependency Inversion Principle - DIP)
DIP гласит, что модули высшего уровня не должны зависеть от модулей нижнего уровня.
Они должны зависеть от абстракций, а не от конкретных реализаций.
 */
public class DIP {
    interface MessageSender {
        void sendMessage(String message);
    }

    class EmailSender implements MessageSender {
        public void sendMessage(String message) {
            System.out.println("Sending email: " + message);
        }
    }

    class SMSSender implements MessageSender {
        public void sendMessage(String message) {
            System.out.println("Sending SMS: " + message);
        }
    }

    class Notification {
        private MessageSender sender;

        public Notification(MessageSender sender) {
            this.sender = sender;
        }

        public void sendNotification(String message) {
            sender.sendMessage(message);
        }
    }

}

