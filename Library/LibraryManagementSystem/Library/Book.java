
public class Book extends LibraryItem
{
    // private int isbn;
    public Book(String id,String title)
    {
        this.id=id;
        this.title=title;
        // this.isbn=isbn;
    }
    public String getItemDetails(){
        // System.out.println("Id: \t"+id);
        // System.out.println("title \t"+title);
        // // System.out.println("ISBN \t"+isbn);
        return ("Id: \t"+id+"title \t"+title);
    }
} 