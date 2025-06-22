package OOPS;

public class Member {
    private String name;
    private String memberId;
    private int borrowedBooks;

    private static final int BORROW_LIMIT=3;

    public Member(String name, String memberId)
    {
        this.name=name;
        this.memberId=memberId;
        this.borrowedBooks=0;
    }

    public boolean canBorrow()
    {
        return this.borrowedBooks<BORROW_LIMIT;
    }

    public void borrowBook()
    {
        this.borrowedBooks++;
    }

    public void returnBook()
    {
        this.borrowedBooks--;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", memberId='" + memberId + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
