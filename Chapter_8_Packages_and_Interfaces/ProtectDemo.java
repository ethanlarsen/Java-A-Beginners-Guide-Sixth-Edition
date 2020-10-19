// Make the instance variables in Book protected.
// package bookpack;

/*
public class Book {
    protected String title;
    protected String author;
    protected int pubDate;
    
    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
    }
}

// Demonstrate protected.
// package bookpackext;

class ExtBook extends bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() { return publisher; }
    public void setPublisher(String p) { publisher = p; }

    */
    /* There are OK because subclass can access
        a protected member. */

/*
    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }
    public String getAuthor() { return author; }
    public void setAuthor(String a) { author = a; }
    public int getPubDate() { return pubDate; }
    public void setPubDate(int d) { pubDate = d; }
}

class ProtectDemo {
    public static void main(String args[]) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2014, "McGraw-Hill Professional");
        books[1] = new ExtBook("Java: The Complete Reference", "Schildt", 2014, "McGraw-Hill Professional");
        books[2] = new ExtBook("The Art of Java", "Schildt and Holmes", 2003, "McGraw-Hill Professional");
        books[3] = new ExtBook("Red Storm Rising", "Clnacy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road", "Kerouac", 1955, "Viking");

        for(int i=0; i < books.length; i++) books[i].show();

        // Find books by author
        System.out.println("Showing all books by Schildt.");
        for(int i=0; i < books.length; i++)
            if(books[i].getAuthor() == "Schildt")
                System.out.println(books[i].getTitle());
            
            // books[0].title = "test title";  // Error - not accessible
    }
}
*/