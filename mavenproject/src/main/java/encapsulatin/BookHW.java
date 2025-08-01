package encapsulatin;

public class BookHW {
    private String title;
    private String author;
    
    public void setDetails(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void getDetails() {
        System.out.println("Title - " + title);
        System.out.println("Author -" + author);
    }
}