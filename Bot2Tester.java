import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       Scanner chat = new Scanner(System.in);
       System.out.print("Hello. What is your name? ");
       String named = chat.nextLine();
       Bot2 converse = new Bot2(named);
       converse.greeting();
       System.out.println("What is your favorite animal?");
       String animal = chat.nextLine();
       converse.favoriteAnimal(animal);
       System.out.println("Where do you live?");
       String where = chat.nextLine();
       converse.home(where);
       System.out.println("What is you favorite number?");
       int favNum = chat.nextInt();
       converse.favoriteNumber(favNum);
       converse.goodbye();
       
       
    }
}