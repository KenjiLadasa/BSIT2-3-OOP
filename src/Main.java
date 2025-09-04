public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Book 1", "Author A");
        Book book2 = new Book("Book 2", "Author B");
        Book book3 = new Book("Book 3", "Author C");

        try {
            book1.addRating(4);
            book1.addMultipleRatings(5, 4, 3, 5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            book2.addRating(6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            book3.addMultipleRatings(3, 4, 2, 6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println("Total books created: " + Book.getTotalBooks());
        Book highestRatedBook = getHighestRatedBook(book1, book2, book3);
        System.out.println("Highest Rated Book: " + highestRatedBook.displayBook());
    }

    public static Book getHighestRatedBook(Book... books) {
        Book highestRatedBook = books[0];
        for (Book book : books) {
            if (book.getAverageRating() > highestRatedBook.getAverageRating()) {
                highestRatedBook = book;
            }
        }
        return highestRatedBook;
    }
}
