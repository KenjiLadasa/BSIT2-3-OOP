public class Main {

    public static void main(String[] args) {
        // Creating Book instances
        Book book1 = new Book("Platform Technologies", "SIRAD, HAROUN AL RASCID", 180);
        Book book2 = new Book("Data Structure and Algorithms", "RADO, MARCO MARVIN", 328);
        Book book3 = new Book("Networking 1", "PABILONA, ROY EMETERIO", 281);

        // Displaying book information
        System.out.println("\nBook 1 Info:");
        book1.displayInfo();

        System.out.println("\nBook 2 Info:");
        book2.displayInfo();

        System.out.println("\nBook 3 Info:");
        book3.displayInfo();

        // Borrowing and returning books
        System.out.println("\nAttempting to borrow Book 1...");
        book1.borrowBook();
        book1.displayInfo();

        System.out.println("\nAttempting to return Book 1...");
        book1.returnBook();
        book1.displayInfo();

        System.out.println("\nDirectly modifying Book 2 availability...");
        book2.isAvailable = false;  // Modifying directly without any check or method
        book2.displayInfo();
    }
}

