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
        emailMessenger.sendMessage("Wiadomosc email!");

        int result = MathUtils.add(5, 7);
        System.out.println("Sum of 5 and 7 is: " + result);

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("The sum of 5 and 7 is: " + result);*/

        Person[] people = new Person[5];

        final int b = 10;

        try {
            
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Kacper Orm", 25);
            people[2] = new Person("Julia Orm", 40);
            people[3] = new Person("Mikolaj S", 35);
            people[4] = new Person("David willy", 28);

  
            for (Person person : people) {
                int value = MathUtils.add(person.getAge(), b);

                EmailMessenger emailMessenger = new EmailMessenger();
                emailMessenger.sendMessage("Wartosc wyliczona dla " + person.getName() + " wynosi: " + value);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
