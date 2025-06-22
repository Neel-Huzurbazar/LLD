package OOPS;

public class LMS {
    public static void main(String[] args) {
        Library library=new Library();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "12345",new PhysicalBook());
        Book book2 = new Book("1984", "George Orwell", "67890",new EBook());
        book1.read();
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member1);
        library.addMember(member2);

        library.issueBook("The Great Gatsby", "M001");
        library.issueBook("1984", "M002");
        library.returnBook("The Great Gatsby", "M001");
    }
}
