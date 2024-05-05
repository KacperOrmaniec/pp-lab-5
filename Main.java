import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        /*try {
            Person person = new Person("Kacper", 21);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Wiadomosc email!");*/

        int result = MathUtils.add(5, 7);
        System.out.println("Sum of 5 and 7 is: " + result);

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("The sum of 5 and 7 is: " + result);
    }
}
