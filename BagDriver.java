package Project1.src;
import java.util.Arrays;
import java.util.Scanner;
public class BagDriver {
    public static void main(String[] args) throws NullPointerException {
        int choice1;
        BagInterface<Integer> bag1 = new ResizableArrayBag<>();
        BagInterface<Integer> bag2 = new ResizableArrayBag<>();
        BagInterface<Integer> bag3 = new LinkedBag<>();
        BagInterface<Integer> bag4 = new LinkedBag<>();
        Scanner keyboard = new Scanner(System.in);

        // Add some numbers to all bags
        for (int i = 1; i <= 10; i++) {
            bag1.add(i);
            bag2.add(i * 2);
            bag3.add(i * 3);
            bag4.add(i * 4);
        }

        do {
            System.out.println("Enter 1 for Union, 2 for Intersection, 3 for Difference, 4 for Quit: ");
            choice1 = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice1) {
                case 1:
                    System.out.println("Bag #1 Contents: " + Arrays.toString(bag1.toArray()));
                    System.out.println("Bag #2 Contents: " + Arrays.toString(bag2.toArray()));
                    System.out.print("Union Result: ");
                    System.out.println(Arrays.toString(bag1.union(bag2).toArray()));
                    break;
                case 2:
                    System.out.println("Bag #1 Contents: " + Arrays.toString(bag1.toArray()));
                    System.out.println("Bag #3 Contents: " + Arrays.toString(bag3.toArray()));
                    System.out.print("Intersection Result: ");
                    System.out.println(Arrays.toString(bag1.intersection(bag3).toArray()));
                    break;
                case 3:
                    System.out.println("Bag #2 Contents: " + Arrays.toString(bag2.toArray()));
                    System.out.println("Bag #4 Contents: " + Arrays.toString(bag4.toArray()));
                    System.out.print("Difference Result: ");
                    System.out.println(Arrays.toString(bag2.difference(bag4).toArray()));
                    break;
                case 4:
                    System.out.println("Exiting the program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        } while (choice1 != 4);
    keyboard.close(); }   
}
