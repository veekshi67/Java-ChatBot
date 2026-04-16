import java.util.*;

public class ChatBot {

    static Random rand = new Random();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("ChatBot: Hello! Ask me anything (type 'exit' to quit)");

        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("ChatBot: Goodbye! 👋");
                break;
            }

            else if (input.contains("hi") || input.contains("hello")) {
                String[] replies = {
                    "Hello there! 😊",
                    "Hey! How can I help you?",
                    "Hi! Nice to talk to you!"
                };
                System.out.println("ChatBot: " + replies[rand.nextInt(replies.length)]);
            }

            else if (input.contains("how are you")) {
                System.out.println("ChatBot: I'm doing great! Thanks for asking 😄");
            }

            else if (input.contains("name")) {
                System.out.println("ChatBot: I'm your smart Java ChatBot 🤖");
            }

            else if (input.contains("time")) {
                System.out.println("ChatBot: Current time is " + java.time.LocalTime.now());
            }

            else if (input.contains("date")) {
                System.out.println("ChatBot: Today's date is " + java.time.LocalDate.now());
            }

            else if (input.contains("java")) {
                System.out.println("ChatBot: Java is a powerful object-oriented programming language 💻");
            }

            else if (input.contains("bye")) {
                System.out.println("ChatBot: Bye! Have a great day! 👋");
                break;
            }

            else if (input.contains("your creator") || input.contains("who made you")) {
                System.out.println("ChatBot: I was created by a smart developer like you 😎");
            }

            else {
                String[] fallback = {
                    "Hmm... I didn't understand that 🤔",
                    "Can you rephrase that?",
                    "Interesting... tell me more!",
                    "I'm still learning 😅"
                };
                System.out.println("ChatBot: " + fallback[rand.nextInt(fallback.length)]);
            }
        }

        sc.close();
    }
}