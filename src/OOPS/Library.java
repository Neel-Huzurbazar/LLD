package OOPS;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        this.books = new ArrayList<Book>();
        this.members = new ArrayList<Member>();
    }

    public void addBook(Book book)
    {
        this.books.add(book);
    }

    public void addMember(Member member)
    {
        members.add(member);
    }

    public void issueBook(String title,String memId)
    {
        for(Book book:books)
        {
            if(book.getTitle().equals(title) && book.isAvailable())
            {
                for(Member member:members)
                {
                    if(memId.equals(member.getMemberId()) && member.canBorrow())
                    {
                        member.borrowBook();
                        System.out.println("Borrowed");
                        return;
                    }
                }
            }
        }
        System.out.println("Cannot issue book: Either it's unavailable or the member reached their limit.");
    }

    public void returnBook(String title,String memId)
    {
        for(Book book:books)
        {
            if(book.getTitle().equals(title) && book.isAvailable())
            {
                for(Member member:members)
                {
                    if(memId.equals(member.getMemberId()) && member.canBorrow())
                    {
                        member.returnBook();
                        book.setAvailable((true));
                        System.out.println(title + " returned by " + memId);                        return;
                    }
                }
            }
        }
        System.out.println("Return failed: Book or Member details mismatch.");
    }

}
