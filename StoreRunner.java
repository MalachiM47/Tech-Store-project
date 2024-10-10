import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
    Keyboard k1 = new Keyboard();
    System.out.println(k1.toString());
    

    // Creates a Scanner object - feel free to delete if not using!

    
    Scanner input = new Scanner(System.in);
    System.out.println("Whats the price of your keyboard? ");
    k1.setPrice(input.nextDouble());
    System.out.println("Whats the name of your keyboard? ");
    k1.setName(input.next());
    System.out.println("Is it a gaming keyboard true or false? ");
    k1.setGame(input.nextBoolean());
    System.out.println("Is it wireless true or false? ");
    k1.setWireless(input.nextBoolean());
    System.out.println("Is it mechanical true or false? ");
    k1.setMechanical(input.nextBoolean());
    System.out.println("What are its switches?");
    k1.setSwitches(input.next());
    System.out.println("What is its size percentage?");
    k1.setSize(input.nextInt());
    System.out.println(k1.toString());




    // Closes the Scanner object
     input.close();

    Mouse m1= new Mouse(59.99, "G502", true, false, 800, true, 100);
    System.out.println(m1.toString());

    techItem headphones = new techItem(129.99, "a50", true, true);
    System.out.println(headphones.toString());
}
}